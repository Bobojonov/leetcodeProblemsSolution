class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        int[] dp = new int[s.length() + 1];
        int curr = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = curr; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i + 1] = dp[i] + 1;
                    curr = j + 1;
                    break;
                }
            }
        }
        return dp[s.length()] == s.length();
    }
}