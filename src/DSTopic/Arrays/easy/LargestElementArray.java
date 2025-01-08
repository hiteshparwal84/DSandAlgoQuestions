package DSTopic.Arrays.easy;

public class LargestElementArray {


    public static void main(String... args) {
        int ar[] = {2, 3, 5, 1, 0};
        LargestElementArray largest = new LargestElementArray();
        System.out.println(largest.findLargestUsingMax(ar));

    }

    public int findLargestUsingBruteForce(int ar[]) {
       /* Approch 1 : Using two loops and checking each and every element with other element
        time complexity = O(n2)
        space complexity = O(1)

        Approch 2: Sort the array in ascending order and print ar[length-1] element

        time complexity = O(nlogn) for sorting Arrays.sort()
        space complexity = O(n)

        */
        return 0;
    }


    public int findLargestUsingMax(int ar[]) {
        int max = 0;

        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] >= max)
                max = ar[i];
        }

        return max;
        /*
                  time complexity O(n) for linear iteration
                  space complexity O(1)
         */
    }
}
