public class CircularDoublyLL {
    private Node head;
    private Node last;
    private int size;

    public CircularDoublyLL() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    public void insertFirst(int val){

        Node node = new Node(val);

        if(last == null){
            head = node;
            last = node;

            node.next = node;
            node.prev = node;
        }
        else{
            node.next = head;
            node.prev = last;

            head.prev = node;
            last.next = node;

            head = node;
        }
        size++;
    }
    
    public void insertLast(int val){

        if(head == null){
            insertFirst(val);
        }
    
            Node node = new Node(val);
            last.next = node;
            node.prev = last;

            node.next = head;
            head.prev = node;

            last = node;

            size++;

    }

    public void insert(int index,int val){
       if(index == 0){
        insertFirst(val);
        return;
       }
       if(index == size){
        insertLast(val);
        return;
       }

       Node temp = head;
       for(int i = 1; i < index; i++){
        temp = temp.next;   
       }

       Node node = new Node(val,temp,temp.next);
       temp.next.prev = node;
       temp.next = node;

       size++;
    }

    public void deleteFirst(){
        if(head == null) return;

        if(size == 1){
            head = null;
            last = null;
        }
        else{
            head = head.next;
            head.prev = last;
            last.next = head;
        }

        size--;
    }

    public void deleteLast(){
        if(last == null) return;

        if(size == 1){
            head = null;
            last = null;
        }
        else{
            Node temp = head;

            while(temp.next.next != head){
                temp = temp.next;
            }

            temp.next = null;
            last = temp;

            size--;
        }
    }

    public void delete(int index,int val){
        if(index == 0){
            deleteFirst();
            return;
        }
       
        if(index == size - 1){
             deleteLast();
             return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void display(){
        Node temp = head;
        for(int i = 0; i < size; i++){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int val){
            this.data = val;
            this.next = null;
            this.prev = null;
        }

        public Node(int val,Node next) {
            this.data = val;
            this.next = next;
        }

        public Node(int val,Node prev,Node next) {
            this.data = val;
            this.next = next;
            this.prev = prev;
        }

    }
}
