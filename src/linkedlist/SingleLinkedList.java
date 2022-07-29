package linkedlist;

public class SingleLinkedList {

    public LinkedList head;
    public LinkedList tail;
    public int size = 0;

    public static void main(String... args) {
        SingleLinkedList single = new SingleLinkedList();
        single.addAtBegnning(10);
        single.addAtBegnning(20);
        single.addAtBegnning(30);
        single.traverseList();
        single.addTheEnd(40);
        single.traverseList();
        single.atAnyLocation(50,2);
        single.traverseList();
        single.atAnyLocation(60,6);
        single.traverseList();
        single.atAnyLocation(70,6);
        single.traverseList();
        single.atAnyLocation(100,4);
        single.traverseList();
        single.deleteNode(1);
        single.traverseList();
        single.deleteNode(7);
        single.traverseList();
        single.deleteNode(4);
        single.traverseList();
        single.deleteNode(10);
        single.traverseList();
        single.searchNode(70);
    }

    public void createLinkedList(int value) {
        LinkedList linkedList = new LinkedList();
        linkedList.next = null;
        linkedList.value = value;
        head = linkedList;
        tail = linkedList;
        size++;
    }

    public void addAtBegnning(int value) {
        LinkedList sing = new LinkedList();
        if (head == null) {
            createLinkedList(value);
            return;
        } else {
            sing.next = head;
            sing.value = value;
            head = sing;
        }
        size++;
    }

    public void addTheEnd(int value) {
        LinkedList endNode = new LinkedList();
        if (head == null) {
            createLinkedList(value);
        }
        endNode.value = value;
        LinkedList tempNode = head;
        while (tempNode.next != null)
            tempNode = tempNode.next;
        tempNode.next = endNode;
        endNode.next = null;
        tail = endNode;
        size++;
    }
    
    public void atAnyLocation(int value, int location)
    {
        if (head==null)
            createLinkedList(value);
        else if (location>size)
            addTheEnd(value);
        else if (location == 1)
            addAtBegnning(value);
        else
        {
            LinkedList newNode = new LinkedList();
            newNode.value = value;
            LinkedList tempNode = head;
            for(int i = 1; i<location-1;i++)
                tempNode = tempNode.next;
            newNode.next = tempNode.next;
            tempNode.next=newNode;
            size++;

        }
    }

    public  void deleteNode(int location)
    {
        if(location > size)
            System.out.println("\nNode doesn't exit");
        else if (head==null)
            System.out.println("\nLinked list is empty");
        else if (location == 1) {
            LinkedList temp = head.next;
            head = temp;
            size--;
        }else {
            LinkedList temp = head;
            for (int i = 1; i < location-1; i++)
                temp = temp.next;
            temp.next = temp.next.next;
            if(location == size)
                tail = temp;
            size--;
        }
    }

    public  void searchNode(int nodeValue)
    {
        if(head==null)
            System.out.println("\nValue Doesn't exit");

        LinkedList node = head;
        int count =1;
        int flag = 0;
        while(count <= size)
        {
            if(node.value == nodeValue) {
                System.out.println("\nValue found at node " + count);
                flag =1;
                break;
            }
            node = node.next;
            count++;
        }
        if(flag == 0)
            System.out.println("\nvalue doesn't exist");


    }

    public void traverseList() {
        if (head == null)
            System.out.println("LInked list doesn't exit");
        else {
            LinkedList sn = head;
            System.out.println(" ");
            while (sn.next != null) {
                System.out.print(sn.value + "->");
                sn = sn.next;
            }
            System.out.print(sn.value);
        }

    }
}
