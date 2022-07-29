package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxProduct {
    // {9,2,3,4,6,7,8,-10,-11}  find the Max product of two numbers
    /* there are two solution
    A.
    1. sort the Array
    2. find the  2 max negative integer(0,1 index  if having,  and max two positive integer last two index of array
    3. compare there product which is bigger that's the ans;

    complexity: O(nlogn) due to sort

    B. complexity O(n)
    Iterate the Array 2 times and find  2 max positive and negative integer and compare the product.
     */
    public static void main(String... args) {
        List<Integer> val = Arrays.asList(-19, -2, 3, -4, 6, 7, 8, -10, -11);
        MaxProduct max = new MaxProduct();
        max.findMaxProduct(val);
    }

    private void findMaxProduct(List<Integer> val) {
        // {9,2,3,4,6,7,8,-10,-11}
        int positveFirstMax = Integer.MIN_VALUE;
        int positveSecondMax = Integer.MIN_VALUE;
        int negativeFirstMax = 0;
        int negativeSecondMax = 0;

        for (int value : val) {
            if (value > 0) {
                if (value > positveFirstMax) {
                    positveSecondMax = positveFirstMax;
                    positveFirstMax = value;
                } else if (value > positveSecondMax)
                    positveSecondMax = value;
            }
            if (value < 0 ) {
                if (value < negativeFirstMax) {
                    negativeSecondMax = negativeFirstMax;
                    negativeFirstMax = value;
                } else if (value < negativeSecondMax) {
                    negativeSecondMax = value;
                }
            }
        }
        if (positveFirstMax * positveSecondMax > negativeFirstMax * negativeSecondMax)
            System.out.println(positveFirstMax + "," + positveSecondMax);
        else
            System.out.println(negativeFirstMax + "," + negativeSecondMax);
    }
}
