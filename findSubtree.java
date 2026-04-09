
public class findSubtree {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {

        static int idx = -1;

        public static Node BuildTree(int nodes[]) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
    }

    public static boolean isIdentical(Node node, Node subTree) {
        if(node == null && subTree == null) {
            return true;
        } else if(node == null || subTree == null || node.data != subTree.data) {
            return false;
        }

        if(!isIdentical(node.left, subTree.left)) {
            return false;
        }

        if(!isIdentical(node.right, subTree.right)) {
            return false;
        }

        return true;
    }

    public static boolean isSubTree(Node root, Node subTree) {
        if(root == null) {
            return false;
        }

        if(root.data == subTree.data) {
            if(isIdentical(root, subTree)) {
                return true;
            }
        }

        boolean left = isSubTree(root.left, subTree);
        boolean right = isSubTree(root.right, subTree);

        return left || right;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubTree(root, subRoot));
    }
}
