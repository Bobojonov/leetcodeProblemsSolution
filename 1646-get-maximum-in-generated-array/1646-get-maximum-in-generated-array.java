class Solution {
    public int getMaximumGenerated(int n) {
        if (n < 1) return 0;
        if (n < 2) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        int max = dp[0];
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) dp[i] = dp[i / 2];
            else dp[i] = dp[i / 2] + dp[i / 2 + 1];
            max = Math.max(dp[i], max);
        }
        return max;
    }
}