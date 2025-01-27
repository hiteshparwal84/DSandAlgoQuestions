package DSTopic.linkedlist;

public class FindMiddleNodeOfLinkedList {


    public static void main(String... args) {
     /*   LinkedList head = new LinkedList();
        head.value = 1;
        head.next = new LinkedList();
        head.next.value = 2;
        head.next.next = new LinkedList();
        head.next.next.value = 3;
        head.next.next.next = new LinkedList();
        head.next.next*/

        FindMiddleNodeOfLinkedList findMiddleNodeOfLinkedList = new FindMiddleNodeOfLinkedList();
        int arr[] = {1, 2, 3, 4, 5};
        LinkedList head = findMiddleNodeOfLinkedList.convertArrayToLL(arr);


        int val = findMiddleNodeOfLinkedList.findMiddleElement(head);
        System.out.println(val);

    }


    public LinkedList convertArrayToLL(int[] arr) {

        LinkedList head = new LinkedList();
        LinkedList temp = head;
        for (int i = 0; i < arr.length; i++) {
            temp.value = arr[i];
            if (i == arr.length - 1)
                temp.next = null;
            else {
                temp.next = new LinkedList();
            }
            temp = temp.next;

        }
        return head;
    }


    public int findMiddleElement(LinkedList head) {

        LinkedList slow = head;
        LinkedList fast = head;

        while (fast != null && fast.next != null && slow != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.value;
    }
}
