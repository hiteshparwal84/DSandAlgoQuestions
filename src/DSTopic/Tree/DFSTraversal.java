package DSTopic.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class DFSTraversal {

    public static void main(String... args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(9);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(16);
        root.right.left.right = new Node(13);
        root.right.left.left = new Node(11);

        DFSTraversal df = new DFSTraversal();
        df.DFS(root);
    }


    public void DFS(Node root) {
        Queue<Node> que = new LinkedList();
        int dept = 0;
        if (root == null)
            return;

        que.add(root);
        que.add(null);

        while (!que.isEmpty()) {
            Node temp = que.poll();
            if (temp == null)
                dept++;
            else if(temp != null){
                System.out.print(temp.value + " ");
                if (temp.left != null)
                    que.add(temp.left);
                if (temp.right != null)
                    que.add(temp.right);
            }
            else if(!que.isEmpty())
                que.add(null);
        }

        System.out.println("height of tree: " + dept);
    }


}
