public class Main {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(9);
        list.insertLast(10);
        list.insertLast(17);
        list.insertLast(19);
        list.display();
        list.insert(15,5);
        list.display();
        list.getSize();
        System.out.println(list.getTail());
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.delete(2);
        list.display();
    }
}
