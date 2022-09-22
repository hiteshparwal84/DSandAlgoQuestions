package DSTopic.leetCode.medium;

import java.util.HashMap;

public class JumpGame {

    public static void main(String... args) {

        JumpGame game = new JumpGame();
        int nums[] = {};
       // System.out.println(game.canJumpTolast(nums));

       // System.out.println(game.maxProfit());

    }

    public void canJumpTolast(int[] nums) {

        int min = Integer.MIN_VALUE;

    }

    public int maxProfit(int[] prices) {

        int buyNow = Integer.MAX_VALUE;
        int sellTomorrow = 0;

        for (int i = 1; i < prices.length; i++) {

            if (buyNow > prices[i])
                buyNow = prices[i];

            if (prices[i] > buyNow && sellTomorrow < prices[i]) {
                sellTomorrow = prices[i];
            }
        }
        if (sellTomorrow - buyNow <= 0)
            return 0;
        else
            return sellTomorrow - buyNow;

    }


}


