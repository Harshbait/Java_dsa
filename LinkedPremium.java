
/** Question 2:**

  ****Delete N Nodes After M Nodes of a Linked List**
 *
 *  *We have a linked list and two integers M and N. Traverse the linked list such that you retain M nodes then delete next N nodes, continue the same till end of the linked list. Difficulty Level: Rookie.

  ****Sample Input 1:**
 * M = 2, N = 2
 * LL: 1 → 2 → 3 → 4 → 5 → 6 → 7 → 8

  ****Sample Output 1:**
 * 1 → 2 → 5 → 6

  ****Sample Input 2:**
 * M = 3, N = 2
 * LL: 1 → 2 → 3 → 4 → 5 → 6 → 7 → 8 → 9 → 10

  ****Sample Output 2:**
 * 1 → 2 → 3 → 6 → 7 → 8

  ** */
public class LinkedPremium {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function: retain M nodes, delete N nodes
    public static void deleteNafterM(Node head, int M, int N) {
        Node curr = head;

        while (curr != null) {
            for (int i = 0; i < M - 1 && curr != null; i++) {
                curr = curr.next;
            }

            if (curr == null) {
                return;
            }

            Node temp = curr.next;

            for (int i = 0; i < N && curr != null; i++) {
                temp = temp.next;
            }

            curr.next = temp;
            curr = temp;
        }

    }

    // Insert at end
    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    // Print list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = null;

        // Create linked list: 1→2→3→4→5→6→7→8
        for (int i = 1; i <= 8; i++) {
            head = insert(head, i);
        }

        System.out.println("Original list:");
        printList(head);

        int M = 2;
        int N = 2;

        deleteNafterM(head, M, N);

        System.out.println("After deletion:");
        printList(head);
    }
}
