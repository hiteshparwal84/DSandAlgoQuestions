package DSTopic.Arrays.easy;

public class SecondSmallestAndSecondLargestElement {


    public static void main(String... args) {

        int arr[] = {2, 1, 3, 4, 6,7,0,9};
        SecondSmallestAndSecondLargestElement secondSmallestAndSecondLargestElement = new SecondSmallestAndSecondLargestElement();
        System.out.println(secondSmallestAndSecondLargestElement.optimalSecondLargest(arr));
        System.out.println(secondSmallestAndSecondLargestElement.optimalSecondSmall(arr));


    }

    public void bruteForceApproch(int ar[]) {
        /*
              sort the array and print the arr[1] and arr[length-2] value for second smallest and second largest element respectively
              Time Complexity : O(nlogn)
         */
    }

    public void betterApproach(int ar[]) {
              /*
                    *  Find smallest and largest Element in single traversal
                    *  Again do one more traversal to find second smallest and largest and return

                    Time Complexity : O(n + n ) = O(n) as for two liner traversal on same array of n
                    Space complexity : O(1)
               */
    }



    public int optimalSecondLargest(int ar[]) {

        int largest = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for (int i = 0; i < ar.length ; i++) {
            if (ar[i] > largest) {
                secondLarge = largest;
                largest = ar[i];
            } else if (ar[i] < largest && ar[i] > secondLarge)
                secondLarge = ar[i];
        }

        return secondLarge;

    }


    public int optimalSecondSmall(int ar[]) {
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < small) {
                secondSmall = small;
                small = ar[i];
            } else if (ar[i] > small && ar[i] < secondSmall)
                secondSmall = ar[i];
        }

        return secondSmall;

    }
}
