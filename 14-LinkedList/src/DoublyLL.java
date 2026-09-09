class DoublyLL{
    private Node head;
    private Node last;
    private int size;

    public DoublyLL(){
        this.size = 0;
    }

    public int getSize(){
        return size;
    }

    public int get(int index){
        if(index >= size) return -1;

        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void insertFirst(int val){
        Node node = new Node(val);

        node.next = head;

        if(head != null) head.prev = node;

        head = node;

        if(last == null){
            last = node;
        }

        size++;
    }
    
    public void insertLast(int val){
        if(last == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        last.next = node;
        node.prev = last;
        last = node;

        size++;
    }

    public void insert(int val,int index){
        if(index == 0) insertFirst(val);
        if(index == size) insertLast(val);

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(val,temp,temp.next);
        temp.next = node;
        node.next.prev = node;

        size++;
    }

    public void deleteFirst(){
        if(head == null) return;

        if(head.next == null){
            head = null;
            last = null;
        }else{
            head.next.prev = null;
            head = head.next;
        }
        size--;
    }

    public void deleteLast(){
        if(last == null) return;

        if(last.prev == null){
            head = null;
            last = null;
        }
        else{
            Node temp = last.prev;
            last = temp;
            temp.next = null;
        }
        size--;
    }

    public void delete(int index){
        if(index == 0) deleteFirst();
        if(index == size - 1) deleteLast();
        else{
            Node temp = head;
            for(int i = 1; i < index; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
        }
        size--;
    }

    public void reverse(){
        Node temp = last;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public Node find(int value){
        Node temp = head;
        while(temp != null){
            if(temp.data == value) return temp;
            temp = temp.next;
        }
        return null;
    }

    private class Node{
        private int data;
        private Node next;
        private Node prev;
        
        public Node(int val){
            this.data = val;
        }

        public Node(int val,Node next){
            this.data = val;
            this.next = next;
        }

        public Node(int val,Node prev,Node next){
            this.data = val;
            this.next = next;
            this.prev = prev;
        }
    }
}