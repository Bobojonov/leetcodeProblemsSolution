class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= s.length(); i++) {
            int digit_one  = Integer.valueOf(s.substring(i - 1, i));
            int digit_two  = Integer.valueOf(s.substring(i - 2, i));
            if (digit_one >= 1)
                dp[i] += dp[i - 1];
            if (digit_two >= 10 && digit_two <= 26)
                dp[i] += dp[i - 2];
        }
        return dp[s.length()];
    }
}