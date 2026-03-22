import java.util.*;

public class Deque {
    public static void main(String[] args) {
        java.util.Deque<Integer> q = new java.util.LinkedList<>();

        q.addFirst(1);
        q.addFirst(2);
        q.addLast(3);
        q.addLast(4);
        System.out.println(q);
        q.removeLast();
        System.out.println(q);

        
    }
}
