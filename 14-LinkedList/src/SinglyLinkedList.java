class Node{
    int data;
    Node next;

    public Node(int val){
        this.data = val;
    }
    public Node(int data,Node next) {
        this.data = data;
        this.next = next;
    }
}
public class SinglyLinkedList {
    static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        Node head = first;

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
    }
}
