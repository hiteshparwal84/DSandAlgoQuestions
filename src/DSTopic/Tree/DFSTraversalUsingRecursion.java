package DSTopic.Tree;

public class DFSTraversalUsingRecursion {

    public static void main(String... args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        DFSTraversalUsingRecursion dfs = new DFSTraversalUsingRecursion();
        System.out.println("Inorder Traversal");
        dfs.inOrder(root);
        System.out.println("preOrder Traversal");
        dfs.preOrder(root);
        System.out.println("postOrder Traversal");
        dfs.postOrder(root);
        System.out.println();
        System.out.println("height of tree " + dfs.heightOfTree(root));
    }

    public void inOrder(Node root) {
        if (root.left != null)
            inOrder(root.left);
        System.out.print(root.value + " ");
        if (root.right != null)
            inOrder(root.right);
    }

    public void preOrder(Node root) {
        if (root.left != null)
            preOrder(root.left);
        if (root.right != null)
            preOrder(root.right);
        System.out.print(root.value + " ");
    }

    public void postOrder(Node root) {
        System.out.print(root.value + " ");
        if (root.left != null)
            postOrder(root.left);
        if (root.right != null)
            postOrder(root.right);
    }

    public int heightOfTree(Node root) {
        if (root == null)
            return 0;
        return 1 + Math.max(heightOfTree(root.left), heightOfTree(root.right));
    }
}
