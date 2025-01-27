package DSTopic.linkedlist;

import java.sql.SQLOutput;
import java.util.HashMap;

public class FindLengthOfLoop {


    public static void main(String... args) {

        LinkedList head = new LinkedList(1);
        head.next = new LinkedList(2);
        head.next.next = new LinkedList(3);
        head.next.next.next = new LinkedList(4);
        head.next.next.next.next = new LinkedList(5);
        head.next.next.next.next.next = new LinkedList(6);
        head.next.next.next.next.next.next = new LinkedList(7);
        head.next.next.next.next.next.next.next = head.next.next.next;

        System.out.println("Length of loop Optimal approach");
        System.out.println(FindLengthOfLoop.LengthOfLoop(head));

        System.out.println("Length of loop with brute force approach");
        System.out.println(FindLengthOfLoop.FindLengthLoopBrute(head));

    }

    /*
        Optimal Approch
       Done by fast and slow pointer Complexity  time:  O(N) Space : O(n)
     */

    public static int LengthOfLoop(LinkedList head) {

        if (head == null && head.next != null)
            return 0;

        LinkedList slow = head;
        LinkedList fast = head;
        int length = 0;
        while (slow != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = slow.next;
                while (slow != fast) {
                    slow = slow.next;
                    length++;
                }
                break;
            }
        }
        return length;

    }

    /*
        using HashMap with Timer counter
              BruteForce approch
     */

    public static int FindLengthLoopBrute(LinkedList head) {

        if (head == null)
            return 0;

        HashMap<LinkedList, Integer> map = new HashMap<>();

        LinkedList temp = head;
        int length = 0;
        int temper = 0;
        while (temp != null) {

            if (!map.containsKey(temp)) {
                temper++;
                map.put(temp, temper);
                temp = temp.next;
            } else {
                int value = map.get(temp);
                length = temper - value;
                break;
            }

        }

        return length;

    }
}
