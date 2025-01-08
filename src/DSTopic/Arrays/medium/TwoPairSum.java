package DSTopic.Arrays.medium;

import java.util.HashMap;

public class TwoPairSum {
    /*Example 1:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.

Example 2:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 15
Result: NO (for 1st variant)
	[-1, -1] (for 2nd variant)
Explanation: There exist no such two numbers whose sum is equal to the target.*/


    public static void main(String... args) {
        int arr[] = {2, 6, 5, 8, 11};
        int k = 14;
        TwoPairSum pairSum = new TwoPairSum();
        pairSum.findPair(arr, k);

        pairSum.twoPointer(arr, k);
    }


    /* optimal approach  Using Hash Map  and checking with formula a = c-b
        Time complexity O(n)    ->
        space Complexity O(n)

     */
    public void findPair(int ar[], int target) {

        if (ar.length < 1)
            return;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            int moreNeeded = target - ar[i];
            if (map.containsKey(moreNeeded)) {
                System.out.println("The Pair found " + map.get(moreNeeded) + "," + i);
                System.out.println("pair is : " + moreNeeded + "," + ar[i]);
                return;
            }
            map.put(ar[i], i);
        }
    }

    /*
       Second approach : using two pointer left and right
         1. sort the array
         2. start the left pointer starting of array  and right pointer end of the array
         3. while (left<right)
         4. if(left+right) > k   then right--
         5.if(left+right)<k then left--

         Tine complexity : O(n logn ) sort take n logn


     */

    public void twoPointer(int arr[], int k) {
        int left = 0;
        int right = arr.length - 1;

        System.out.println("output from Two Pointer Approach ");
        while (left < right) {
            if (arr[left] + arr[right] > k)
                right--;
            else if (arr[left] + arr[right] < k)
                left++;
            else if (arr[left] + arr[right] == k) {
                System.out.println("Pair Found" + arr[left] + "," + arr[right]);
                break;
            } else {
                System.out.println("Not found");
                break;
            }
        }
    }

}
