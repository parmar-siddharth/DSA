public class CircularSinglyLL {
    private Node head;
    private Node last;
    private int size;

    public CircularSinglyLL() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    public void insertFirst(int val){

        Node node = new Node(val);

        node.next = head;
        head = node;

        if(last == null){
            last = node;
        }

        last.next = head;

        size++;
    }
    
    public void insertLast(int val){

        if(last == null){
            insertFirst(val);
            return;
        }    

        Node node = new Node(val);
        last.next = node;
        last = node;
        node.next = head;

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

        Node node = new Node(val,temp.next);
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

        public Node(int val){
            this.data = val;
            this.next = null;
        }

        public Node(int val,Node next) {
            this.data = val;
            this.next = next;
        }

    }
}
