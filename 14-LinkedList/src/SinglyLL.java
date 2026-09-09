class SinglyLL {

    private Node head;
    private Node last;
    private int size;

    public SinglyLL(){
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

   public void insertFirst(int val){
       Node node = new Node(val);
       node.next = head;
       head = node;

       if (last == null){
           last = node;
       }

       size++;
   }

   public void insertLast(int val){
       if (last == null){
           insertFirst(val);
           return;
       }
       Node node = new Node(val);
       last.next = node;
       last = node;

       size++;
   }

   public void insert(int val,int index){

       if (index == 0){
           insertFirst(val);
       }

       if (index == size){
           insertLast(val);
       }

       Node temp = head;
       for (int i = 1; i < index; i++) {
           temp = temp.next;
       }

       Node node = new Node(val,temp.next);
       temp.next = node;

       size++;
   }

   public void deleteFirst(){
       head = head.next;
       size--;
   }

   public void deleteLast(){
    //    Node temp = head;

//       while (temp.next.next != null){
//           temp = temp.next;
//       }
//
//       temp.next = null;
//       last = temp;

       Node secondLast = get(size - 2);
       last = secondLast;
       secondLast.next = null;
       size--;

   }

   public void delete(int index){
        if (index == 0) deleteFirst();

        if (index == size) deleteLast();

       Node temp = head;

       for (int i = 1; i < index; i++) {
           temp = temp.next;
       }
       temp.next = temp.next.next;

       size--;
   }

   public int getSize(){
       return size;
   }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + "|");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int getTail(){
        if (last == null){
            return -1;
        }
        return last.val;
    }

    private class Node{

        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }
}