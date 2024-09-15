class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int s1 = s.length - 1;
        int g1 = g.length - 1;
        int cnt = 0;
        while (Math.min(s1, g1) >= 0) {
            if (s[s1] >= g[g1]) {
                cnt++;
                s1--;
            }
            g1--;
        }
        return cnt;
    }
}