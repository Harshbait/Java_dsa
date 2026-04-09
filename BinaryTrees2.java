public class BinaryTrees2 {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    public static int height(Node root) {
        if(root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        
        return Math.max(lh, rh)+1;
    }

    public static int count(Node root) {
        if(root == null) {
            return 0;
        }

        int lc = count(root.left);
        int rc = count(root.right);
        
        return lc+rc+1;
    }

    public static int sumOdNodeTress(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSum = sumOdNodeTress(root.left);
        int rightSum = sumOdNodeTress(root.right);
        return leftSum+rightSum+root.data;
    }

    public static int diameter(Node root) { //O(n^2)
        if(root == null) {
            return 0;
        }

        int lfDia = diameter(root.left);
        int lfHt = height(root.left);
        int rhDia = diameter(root.right);
        int rhHt = height(root.right);

        int SelfDia = lfHt + rhHt+ 1;

        return Math.max(SelfDia, Math.max(lfDia, rhDia));


    }

    public static void main(String[] args) {
        /* 
                1
               / \
              2   3
             / \ / \
            4  5 6  7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(5);
        root.right.right = new Node(5);

        // System.out.println(height(root));
        // System.out.println("Count: "+count(root));
        // System.out.println("Sum of tress node: "+sumOdNodeTress(root));
        System.out.println(diameter(root));
        
    }
}
