package DSTopic.Tree;

public class BinaryTreePruning {


    public static void main(String... args) {
        Node root = new Node(1);
        //root.left = new Node(2);
        root.right = new Node(0);
        //root.left.left = new Node(4);
        root.right.left = new Node(0);
        root.right.right = new Node(1);
        //root.right.left.left = new Node(7);
        // root.right.left.right = new Node(8);
        BinaryTreePruning prun = new BinaryTreePruning();
        prun.pruneTree(root);
    }

    public Node pruneTree(Node root) {

        checkTree(root);
        return root;
    }

    public Node checkTree(Node root) {
        if (root == null)
            return null;
        if (root.value == 0) {
            if (root.left == null && root.right == null)
                root = null;
            else if ((root.left != null && root.left.value == 0) && ((root.right != null && root.right.value == 0)))
                root = null;
        }
        if(root != null) {
            checkTree(root.left);
            checkTree(root.right);
        }
        return root;
    }
}
