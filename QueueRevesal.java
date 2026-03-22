import java.util.*;

public class QueueRevesal {

    public static void reveal(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        
        while(!q.isEmpty()) {
            s.add(q.remove());
        }

        while(!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new java.util.LinkedList<>();
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reveal(q);

        while(!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
    }
}
