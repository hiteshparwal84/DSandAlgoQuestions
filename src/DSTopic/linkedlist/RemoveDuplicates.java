package DSTopic.linkedlist;

import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String... args) {
        SingleLinkedList single = new SingleLinkedList();
        single.addAtBegnning(1);
        single.addAtBegnning(2);
        single.addTheEnd(1);
        single.addAtBegnning(3);
        single.addTheEnd(4);
        single.addTheEnd(3);
        single.traverseList();
        RemoveDuplicates rem = new RemoveDuplicates();
        rem.removeDups(single);
        single.traverseList();

    }

    public void removeDups(SingleLinkedList ll) {
        HashSet<Integer> hs = new HashSet<>();
        LinkedList current = ll.head;
        LinkedList previous = null;
        while (current != null) {
            if (!hs.contains(current.value)) {
                hs.add(current.value);
                previous = current;
            } else {
                previous.next = current.next;
                ll.size--;
                if (ll.tail == current)
                    ll.tail = previous;
            }
            current = current.next;
        }

    }

}
