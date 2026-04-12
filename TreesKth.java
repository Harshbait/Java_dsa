import java.util.*;
public class TreesKth {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            Node left = null;
            Node right = null;
        }
    }

    public static void levelOrder(Node root, int k) {
        if(root == null) {
            return;
        } 

        Queue<Node> q = new java.util.LinkedList<>();
        int nu = 1;
        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();

            for(int i = 0; i < size; i++) {
                Node curr = q.poll();

                if(nu == k) {
                    System.out.print(curr.data+" ");
                }

                if(curr.left != null) {
                    q.add(curr.left);
                }

                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
            nu++;
        }
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        levelOrder(root, 3);
    }
}