package DSTopic.linkedlist;

class Node {

    public int num;
    public Node next;

    public Node(int num) {
        this.num = num;
        this.next = null;
    }
}


public class LoopInLInkedList {


    public static void main(String... args) {
        LoopInLInkedList loop = new LoopInLInkedList();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println(isLoop(head) ? "Yes" : "No");

        // Making the linked list circular
        head.next.next.next.next = head.next.next;

        // Check again if the linked list is circular
        System.out.println(isLoop(head) ? "Yes" : "No");


    }

    private static boolean isLoop(Node head) {

        if (head == null && head.next != null)
            return false;

        Node slow = head;
        Node fast = head;
        boolean isLoop = false;

        while (slow != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isLoop = true;
                break;
            }
        }

        return isLoop;
    }


}
