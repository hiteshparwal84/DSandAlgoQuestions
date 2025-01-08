package DSTopic.linkedlist;

class LinkedNode {

    public int value;
    public LinkedNode next;

    public LinkedNode(){};
    public LinkedNode(int value) {
        this.value = value;
        this.next = null;
    }

}


public class MergeSortedList {
    public static void main(String... args) {

        LinkedNode list1 = new LinkedNode(10);
        list1.next = new LinkedNode(13);
        list1.next.next = new LinkedNode(20);

        LinkedNode list2 = new LinkedNode(2);
        list2.next = new LinkedNode(5);
        list2.next.next = new LinkedNode(12);

        LinkedNode resultList = mergeSort(list1,list2);

        while (resultList.next!=null)
        {
            System.out.println(resultList.value);
            resultList = resultList.next;
        }
    }

    public static LinkedNode mergeSort(LinkedNode list1, LinkedNode list2)
    {
        if(list1 == null && list2 == null )
            return null;

        LinkedNode resultList = new LinkedNode();

        LinkedNode tempNode = resultList;

        while(list1 != null || list2!=null)
        {
            int val1= list1 != null ? list1.value : Integer.MAX_VALUE;
            int val2 = list2!=null ?list2.value:Integer.MAX_VALUE;

            if(val1<val2)
            {
             tempNode.value = val1;
             tempNode.next = new LinkedNode();
             tempNode = tempNode.next;
             list1 = list1.next;
            }else {
                tempNode.value = val2;
                tempNode.next = new LinkedNode();
                tempNode = tempNode.next;
                list2 = list2.next;
            }
        }

        return resultList;
    }


}
