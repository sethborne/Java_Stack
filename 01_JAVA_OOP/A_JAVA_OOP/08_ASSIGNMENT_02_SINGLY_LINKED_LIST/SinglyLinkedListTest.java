class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
        sll.add(42);
        // sll.removeAt(2);
        // sll.removeAt(200);
        // sll.remove();
        // sll.printValues();
        sll.printValues();
        sll.remove();
        sll.printValues();
    }
}