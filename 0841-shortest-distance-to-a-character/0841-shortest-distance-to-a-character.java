class Solution {
    public int[] shortestToChar(String s, char c) {
        int left = -1, right = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                left = i;
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                right = i;
                break;
            }
        }
        int[] res = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                res[i] = 0;
                left = i;
            } else {
                res[i] = Math.abs(i - left);
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                right = i;
            }
            else {
                res[i] = Math.min(res[i], Math.abs(right - i));
            }
        }
        return res;
    }
}