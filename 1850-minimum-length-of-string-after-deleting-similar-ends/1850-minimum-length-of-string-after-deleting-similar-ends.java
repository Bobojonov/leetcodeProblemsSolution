class Solution {
    public int minimumLength(String s) {
        int l = 0, r = s.length() - 1, res = 0;
        while (l < r) {
            int start = l, end = r;
            while (l <= r && s.charAt(l) == s.charAt(end)) {
                l++;
            }
            while (r >= l && s.charAt(r) == s.charAt(start))
                r--;
            if (l < s.length() && r >= 0 && s.charAt(l) != s.charAt(r)) break;
        }
        return r - l + 1;
    }
}