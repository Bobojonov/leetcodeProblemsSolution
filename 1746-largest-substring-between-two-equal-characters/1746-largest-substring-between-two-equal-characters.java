class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max_len = -1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    max_len = Math.max(j - i - 1, max_len);
                }
            }
        }
        return max_len;
    }
}