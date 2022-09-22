package DSTopic.linkedlist;

public class ReverseLinkedList {

    public static void main(String...args)
    {
        SingleLinkedList sin = new SingleLinkedList();
        sin.addAtBegnning(10);
        sin.addTheEnd(20);
        sin.addTheEnd(30);
        sin.addTheEnd(40);
        sin.traverseList();
        ReverseLinkedList rr = new ReverseLinkedList();
        rr.reverseList(sin);
        sin.traverseList();
    }


    public void reverseList( SingleLinkedList ll)
    {

        LinkedList previous = null;

        LinkedList current = ll.head;

        LinkedList next = null;

        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        ll.head = previous;

    }

}
