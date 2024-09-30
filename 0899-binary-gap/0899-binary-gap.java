class Solution {
    public int binaryGap(int n) {
        int res = 0;
        for (int d = -32; n > 0; n /= 2, d++)
            if (n % 2 == 1) {
                res = Math.max(res, d);
                d = 0;
            }
        return res;
    }
}