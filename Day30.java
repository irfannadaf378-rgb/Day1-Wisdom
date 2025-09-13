import java.util.*;

class Day30 {
    public static int coinChange(int[] c, int a) {
        int[] dp = new int[a + 1];
        Arrays.fill(dp, a + 1);
        dp[0] = 0;
        for (int i = 1; i <= a; i++) {
            for (int x : c) {
                if (i - x >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - x]);
                }
            }
        }
        return dp[a] == a + 1 ? -1 : dp[a];
    }

    public static void main(String[] args) {
        int[][] coins = {
            {1, 2, 5},
            {2},
            {1}
        };
        int[] amounts = {11, 3, 0};
        for (int i = 0; i < coins.length; i++) {
            System.out.println(coinChange(coins[i], amounts[i]));
        }
    }
}
