class Solution {
    public int partitionString(String s) {
         int i = 0, cnt = 1, f = 0;
        while (i < s.length()) {
            int x = s.charAt(i) - 'a';
            if ((f & (1 << x)) != 0) {
                f = 0;
                cnt++;
            }
            f = f | (1 << x);
            i++;
        }
        return cnt;
    }
}