package DSTopic.linkedlist;

import DSTopic.Tree.Node;
import sun.awt.image.ImageWatched;

public class RemoveKthFromLast {

    public LinkedList head;
    public LinkedList tail;

    public static void main(String... args) {
        RemoveKthFromLast removeKthFromLast = new RemoveKthFromLast();
        LinkedList list = new LinkedList();
        list.value = 1;
        list.next = new LinkedList();
        list.next.value = 2;
        list.next.next = new LinkedList();
        list.next.next.value = 3;
        list.next.next.next = new LinkedList();
        list.next.next.next.value = 4;
        list.next.next.next.next = new LinkedList();
        list.next.next.next.next.value = 5;
        removeKthFromLast.head = list;
        removeKthFromLast.remove(removeKthFromLast.head, 2);

    }

    private LinkedList remove(LinkedList head, int n) {

        LinkedList fast = head;
        LinkedList slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public LinkedList removeNthFromEnd(LinkedList head, int n) {

        if (head == null)
            return head;
        if (head.next == null) {
            head = null;
            return head;
        }
        LinkedList temp = head;
        int size = 1;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }

        int kThNode = size - n;
        temp = head;
        LinkedList previous = null;
        for (int i = 0; i <= kThNode; i++) {

            if (i == kThNode) {
                if (i == 0) {
                    head = temp.next;
                    break;
                }
                previous.next = temp.next;
            }
            previous = temp;
            temp = temp.next;
        }

        return head;

    }
}
