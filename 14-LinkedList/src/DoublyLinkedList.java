class DoublyNode{
    int data;
    DoublyNode next;
    DoublyNode prev;

    public DoublyNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}
public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyNode first = new DoublyNode(10);
        DoublyNode second = new DoublyNode(20);
        DoublyNode third = new DoublyNode(30);

        first.next = second;
        second.prev = first;

        second.next = third;
        third.prev = second;

        DoublyNode temp = first;
        while(temp != null){
            System.out.print(temp.data + " |");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
