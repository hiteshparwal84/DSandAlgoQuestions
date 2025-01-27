package DSTopic.linkedlist;

import java.util.Stack;

public class PalindromeLinkedList {


    public static void main(String... args) {
        LinkedList head = new LinkedList(10);
        head.next = new LinkedList(20);
        head.next.next = new LinkedList(30);
        head.next.next.next = new LinkedList(20);
        //head.next.next.next.next = new LinkedList(10);
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        System.out.println(palindromeLinkedList.checkpalindrome(head));
    }

    /*
         Using Stack complexity : time O(N) : space : O(N)
     */

    public boolean checkpalindrome(LinkedList head) {
        if (head == null && head.next == null)
            return false;

        Stack<Integer> linkedStack = new Stack<>();

        LinkedList temp = head;

        while (temp != null) {
            if (linkedStack.contains(temp.value))
                linkedStack.pop();
            else
                linkedStack.push(temp.value);

            temp = temp.next;
        }

        if (linkedStack.size() == 1 || linkedStack.isEmpty())
            return true;
        else
            return false;

    }
}
