import java.util.LinkedList;

public class JFCLinkedList {
    public static void main(String[] args) {
        //create linked list
        LinkedList<Integer> ll = new LinkedList<>();
        
        // add
        ll.addLast(2);
        ll.addFirst(1);
        ll.addFirst(0);
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }   
}
