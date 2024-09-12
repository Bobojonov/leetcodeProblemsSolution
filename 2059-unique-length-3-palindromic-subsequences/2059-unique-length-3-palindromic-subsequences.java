class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] left = new int[26], right = new int[26];
        Arrays.fill(left, Integer.MAX_VALUE);
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            left[idx] = Math.min(left[idx], i);
            right[idx] = i;
        }
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (left[i] < right[i]) {
                cnt += (int) s.substring(left[i] + 1, right[i]).chars().distinct().count();
            }
        }
        return cnt;
    }
}