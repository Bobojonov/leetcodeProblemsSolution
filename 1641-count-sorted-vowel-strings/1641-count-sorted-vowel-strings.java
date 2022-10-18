class Solution {
    public int countVowelStrings(int n) {
        int[][] dp = new int[n + 1][6];
        for (int vowel = 1; vowel <= 5; vowel++) dp[1][vowel] = vowel;
        for (int i = 2; i <= n; i++) {
            dp[i][1] = 1;
            for (int vowel = 2; vowel <= 5; vowel++) {
                dp[i][vowel] = dp[i][vowel - 1] + dp[i - 1][vowel];
            }
        }
        return dp[n][5];
    }
}