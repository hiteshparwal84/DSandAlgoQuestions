package DSTopic.linkedlist;

public class SegregateOddEvenNode {

    public static void main(String... args) {
        LinkedList head = new LinkedList(2);
        head.next = new LinkedList(4);
        // head.next.next = new LinkedList(3);
        // head.next.next.next = new LinkedList(4);
        // head.next.next.next.next = new LinkedList(5);
        SegregateOddEvenNode segregateOddEvenNode = new SegregateOddEvenNode();
        LinkedList list = segregateOddEvenNode.segregateEvenOdd(head);

        while (list != null) {
            if (list.next.value == 0)
                list.next = null;
            System.out.println(list.value);
            list = list.next;
        }
    }


    public LinkedList segregateEvenOdd(LinkedList head) {

        if (head == null && head.next != null)
            return head;

        LinkedList even = new LinkedList(-1);
        LinkedList eventemp = even;
        LinkedList odd = new LinkedList(-1);
        LinkedList oddTemp = odd;
        LinkedList temp = head;
        while (temp != null) {
            if (temp.value % 2 == 0) {
                eventemp.value = temp.value;
                eventemp.next = new LinkedList();
                eventemp = eventemp.next;
            } else {

                oddTemp.value = temp.value;
                oddTemp.next = new LinkedList();
                oddTemp = oddTemp.next;
            }
            temp = temp.next;
        }

        if (even != null && even.value != -1) {
            if (odd != null && odd.value != -1) {
                LinkedList addnode = even;
                while (addnode.next.value != 0)
                    addnode = addnode.next;
                addnode.next = odd;

                return even;
            } else
                return even;
        } else
            return odd;


    }
}
