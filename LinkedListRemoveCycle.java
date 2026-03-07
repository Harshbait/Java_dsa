
public class LinkedListRemoveCycle {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int sz;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        sz++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = null;

    }

    public static void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void removeCycle() {
        //Detcet cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        Node prev = null;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        //find meeting point
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        //remove cycle
        prev.next = null;

    }

    public static void main(String args[]) {

        head = new Node(1);
        Node temp = new Node(2);

        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        removeCycle();
        print();
    }

}
