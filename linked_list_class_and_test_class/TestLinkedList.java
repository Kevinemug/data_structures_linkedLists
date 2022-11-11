

public class TestLinkedList {
    public static void main(String[] args) {
        var li  =  new MyLinkedList();
        var l2  =  new MyLinkedList();

        li.insertAtFront(12);
        li.insertAtBack(23);
        li.insertAtFront(98);

        l2.insertAtFront(1);
        l2.insertAtBack(2);
        l2.insertAtBack(9);
        
        System.out.println(l2.toString());
        System.out.println(li.isSortedAsc(l2));
        l2.insertAtFront(8);
        System.out.println(li.isSortedAsc(l2));

        System.out.println(l2.toString());
        System.out.println("final"+li.concantenate(l2).toString());
    }
}
