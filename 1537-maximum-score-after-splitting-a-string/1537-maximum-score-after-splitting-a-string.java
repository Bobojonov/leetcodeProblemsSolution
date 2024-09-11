class Solution {
    public int maxScore(String s) {
        int ones = 0, result = 0, prefix = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') ones++;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                prefix++;
                result = Math.max(result, prefix + ones);
            } else {
                ones--;
                result = Math.max(result, prefix + ones);
            }
        }
        return result;
    }
}