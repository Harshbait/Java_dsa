public class LinkedListPland {
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

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean checkPlandrome() {
        //Base case if LL contain 1 element or it is empty
        if(head == null || head.next == null) {
            return true;
        }

        // step1 find mid
        Node mid = findMid(head);

        //step 2 reverse the 2nd half
        Node curr = mid;
        Node prev = null;
        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        
        //step 3 check left half and right half
        Node right = prev;
        Node left = head;

        while(right != null) {
            if(left.data != right.data) {
                return false; 
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedListPland ll = new LinkedListPland();
        
        ll.addLast(1);  
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(checkPlandrome()); 
    }
}
