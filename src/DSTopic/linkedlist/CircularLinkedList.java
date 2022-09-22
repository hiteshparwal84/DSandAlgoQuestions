package DSTopic.linkedlist;

public class CircularLinkedList {

    private LinkedList head;
    private LinkedList tail;
    int size = 0;


    public static void main(String... args) {
        CircularLinkedList cir = new CircularLinkedList();
        cir.addAtBegning(10);
        cir.addAtBegning(20);
        cir.addAtBegning(30);
        cir.addToTail(40);
        cir.traverseList();
    }

    public void createCircularLinkedList(int value) {
        LinkedList cir = new LinkedList();
        cir.next = cir;
        cir.value = value;
        head = cir;
        tail = cir;
        size++;
    }

    public void addAtBegning(int value) {
        LinkedList cir = new LinkedList();
        if (head == null) {
            createCircularLinkedList(value);
            return;
        } else {
            head.next.next = cir;
            cir.next = head;
            cir.value = value;
            head = cir;
        }
        size++;
    }

    public void addToTail(int value) {
        LinkedList cir = new LinkedList();
        if (head == null) {
            createCircularLinkedList(value);
            return;
        } else {
            LinkedList temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = cir;
            cir.next = head;
            cir.value = value;
            tail = cir;
            size++;
        }
    }

    public void addAnyLocation(int location, int value) {
        LinkedList cr = new LinkedList();
        if (head == null)
            createCircularLinkedList(value);
        else if (location > size)
            addToTail(value);
        else if (location == 1) {
            addAtBegning(value);
        } else {
            LinkedList temp = head;
            for (int i = 1; i <= location - 1; i++)
                temp = temp.next;
            cr.next = temp.next;
            temp.next = cr;
            cr.value = value;
            size++;
        }
    }

    public void traverseList() {
        if (head == null)
            System.out.println("LInked list doesn't exit");
        else {
            LinkedList sn = head;
            System.out.println(" ");
            while (sn.next != head) {
                System.out.print(sn.value + "->");
                sn = sn.next;
            }
            System.out.print(sn.value);
            System.out.print("->" + sn.next.value);
        }

    }
}
