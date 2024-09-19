class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int l = 0, r = removable.length;
        char[] chars = s.toCharArray();
        while (l <= r) {
            int mid = (l + r) / 2;
            for (int i = 0; i < mid; i++) chars[removable[i]] = '/';
            if (isSubsequence(chars, p)) l = mid + 1;
            else {
                for (int i = 0; i < mid; i++) {
                    chars[removable[i]] = s.charAt(removable[i]);
                    r = mid - 1;
                }
            }
        }
        return r;
    }

    public static boolean isSubsequence(char[] chars, String p) {
        int i = 0, j = 0;
        while (i < chars.length && j < p.length()) {
            char c1 = chars[i], c2 = p.charAt(j);
            if (c1 != '/' && c1 == c2) j++;
            i++;
        }
        return j == p.length();
    }
}