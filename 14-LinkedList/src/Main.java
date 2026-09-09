public class Main {
    public static void main(String[] args) {
        // SinglyLL list = new SinglyLL();
        // list.insertFirst(3);
        // list.insertFirst(5);
        // list.insertFirst(7);
        // list.insertFirst(9);
        // list.insertLast(10);
        // list.insertLast(17);
        // list.insertLast(19);
        // list.display();
        // list.insert(15,5);
        // list.display();
        // list.getSize();
        // System.out.println(list.getTail());
        // list.deleteFirst();
        // list.display();
        // list.deleteLast();
        // list.display();
        // list.delete(2);
        // list.display();

        DoublyLL doublyLL = new DoublyLL();
        doublyLL.insertFirst(0);
        doublyLL.insertLast(10);
        doublyLL.insertLast(15);
        doublyLL.insertLast(20);
        doublyLL.insert(5, 1);
        doublyLL.display();
        System.out.println(doublyLL.getSize());
        System.out.println(doublyLL.get(3));
        doublyLL.delete(2);
        doublyLL.display();
        doublyLL.reverse();
        System.out.println(doublyLL.find(15));
    }
}
