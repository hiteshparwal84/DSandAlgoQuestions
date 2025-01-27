package DSTopic.linkedlist;

import java.util.HashMap;

public class FindStartPointOfLoopInLinkedList {

    public static void main(String... args) {
        LinkedList head = new LinkedList(1);
        head.next = new LinkedList(2);
        head.next.next = new LinkedList(3);
        head.next.next.next = new LinkedList(4);
        head.next.next.next.next = new LinkedList(5);
        head.next.next.next.next.next = new LinkedList(6);
        head.next.next.next.next.next.next = new LinkedList(7);
        head.next.next.next.next.next.next.next = head.next.next.next;

        LinkedList firstNode = findFirstNodeofLoop(head);

        System.out.println(firstNode.value);


        LinkedList head2 = new LinkedList(1);
        head2.next = new LinkedList(2);
        head2.next.next = new LinkedList(3);
        head2.next.next.next = new LinkedList(4);
        head2.next.next.next.next = new LinkedList(5);
        head2.next.next.next.next.next = new LinkedList(6);
        head2.next.next.next.next.next.next = new LinkedList(7);
        head2.next.next.next.next.next.next.next = head2.next.next.next;

        LinkedList firstNode2 = findFirstNodeofLoop(head2);

        System.out.println(firstNode2.value);

    }

    /*
             USing slow and Fast Pointer Approch
     */
    public static LinkedList findFirstNodeofLoop(LinkedList head) {
        LinkedList slow = head;
        LinkedList fast = head;

        while (fast != null && fast.next != null && slow != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

            }
            return slow;

        }
        return null;
    }


    public static LinkedList findfirstNodeofLoopusingHashmap(LinkedList head) {

        HashMap<LinkedList, Integer> hashMap = new HashMap<>();
        LinkedList temp = head;

        while (temp != null && temp.next != null) {
            if (!hashMap.containsKey(temp)) {
                hashMap.put(temp, 1);
                temp = temp.next;
            } else
                return temp;
        }
        return null;

    }
}
