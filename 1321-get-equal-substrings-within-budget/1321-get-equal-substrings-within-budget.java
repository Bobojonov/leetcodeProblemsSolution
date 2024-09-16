class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length(), l = 0, r;
        for (r = 0; r < n; r++) {
            maxCost -= Math.abs(s.charAt(r) - t.charAt(r));
            if (maxCost < 0) {
                maxCost += Math.abs(s.charAt(l) - t.charAt(l));
                l++;
            }
        }
        return r - l;
    }
}