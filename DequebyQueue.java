public class DequebyQueue {
    static class Queue {
        java.util.Deque<Integer> d = new java.util.LinkedList<>();

        public void add(int data) {
            d.addLast(data);
        }

        public int remove() {
            return d.removeFirst();
        }

        public int peek() {
            return d.peekFirst();
        }

        public static void main(String[] args) {
            Queue q = new Queue();
            
            q.add(1);
            q.add(2);
            q.add(3);

            System.out.println("Peek: "+q.peek());

            System.out.println(q.remove());
            System.out.println(q.remove());
            System.out.println(q.remove());
        }

    }
}
