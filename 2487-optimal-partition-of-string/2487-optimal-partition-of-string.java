class Solution {
    public int partitionString(String s) {
        int[] chars = new int[26];
        int cnt = 0;
        boolean f = true;
        for (int i = 0; i < s.length(); i++) {
            if (chars[s.charAt(i) - 'a'] > 0) {
                cnt++;
                chars = new int[26];
            }
            chars[s.charAt(i) - 'a']++;
        }
        return cnt + 1;
    }
}