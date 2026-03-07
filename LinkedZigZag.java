public class LinkedZigZag {
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
    public static int size;

    public void addFirst(int data) {
        Node newnode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    public void addLast(int data) {
        Node newnode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;
    }

    public void print() {
        if(head == null) {
            System.out.println("Ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null) { 
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void zigZag() {
        //find mid
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // merger zig zag
        while(left != null && right!= null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
        
            left = nextL;
            right = nextR;
        }
        
    }
    

    public static void main(String[] args) {
        LinkedZigZag ll = new LinkedZigZag();
        
        ll.addLast(1);  
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        // 1 2 3 4 5

        ll.zigZag();
        ll.print();
    }
}
