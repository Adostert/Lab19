package dsa;
public class MainApp {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.addAtBeginning("hello");
        list.addAtBeginning("hello2");
        list.addAtBeginning("hello3");
        list.addAtBeginning("hello4"); // will show at beg. LIFO
        System.out.println(list);
//      MyArrayList ar = new MyArrayList();
//      ar.insertAt(0, "Hello");
//      ar.insertAt(1, "Hello1");
//      ar.insertAt(2, "Hello2");
//      System.out.println(ar);
//      ar.removeAt(1);
//      System.out.println(ar);
//      list.removeAt(1);
//      System.out.println(list);
        list.insertAt(1, "yay!");
        System.out.println(list);
        // System.out.println(list.get(10));
        list.addAtEnd("success");
        System.out.println(list);
        list.removeFromBeginning();
        System.out.println(list);
        list.removeFromEnd();
        System.out.println(list);
        System.out.println("\nLinkedList starts here: ");
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtBeginning("help");
        linkedList.addAtBeginning("help1");
        linkedList.addAtBeginning("help2"); // will show at beg. LIFO
        System.out.println(linkedList);
        linkedList.removeFromEnd();
        System.out.println(linkedList);
//      linkedList.removeFromBeginning();
//      System.out.println(linkedList); // will not include help2
//
//      linkedList.addAtEnd("yay!");
//      System.out.println(linkedList);
    }
}

