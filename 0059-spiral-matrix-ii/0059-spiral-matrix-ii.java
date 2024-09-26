class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int cnt = 1, l = 0, r = n - 1, top = 0, bottom = n - 1;
        while (l <= r && top <= bottom) {
            for (int i = l; i <= r; i++) res[top][i] = cnt++;
            top++;
            for (int i = top; i <= bottom; i++) res[i][r] = cnt++;
            r--;
            if (top <= bottom) {
                for (int i = r; i >= l; i--) res[bottom][i] = cnt++;
                bottom--;
            }
            if (l <= r) {
                for (int i = bottom; i >= top; i--) res[i][l] = cnt++;
                l++;
            }
        }
        return res;
    }
}