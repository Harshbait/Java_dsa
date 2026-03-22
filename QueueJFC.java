import java.util.*;
public class QueueJFC {
    public static void main(String[] args) {
        // Queue q = new Queue();
        
        Queue<Integer> q = new java.util.LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println("Peek value: " + q.peek());
            q.remove();
        }
    }
}
