class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int mod = 1000000007;
        int[][] dp = new int[n + 1][target + 1];
        dp[n][target] = 1;
        for (int idx = n - 1; idx >= 0; idx--) {
            for (int i = 0; i <= target; i++) {
                int ways = 0;
                for (int j = 1; j <= Math.min(k, target - i); j++) {
                    ways = (ways + dp[idx + 1][i + j]) % mod;
                }
                dp[idx][i] = ways;
            }
        }
        return dp[0][0];
    }
}