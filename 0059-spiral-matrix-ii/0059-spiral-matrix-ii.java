class Solution {
    public int[][] generateMatrix(int n) {
        int cnt = 1;
        int top = 0, left = 0, bottom = n - 1, right = n - 1;
        int[][] res = new int[n][n];
        while (top <= bottom && left <= right) {
            for (int i = left; i <= bottom ; i++) {
                res[top][i] = cnt;
                cnt++;
            }
            top++;
            for (int i = top; i <= bottom ; i++) {
                res[i][right] = cnt;
                cnt++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res[bottom][i] = cnt;
                    cnt++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top ; i--) {
                    res[i][left] = cnt;
                    cnt++;
                }
                left++;
            }
        }
        return res;
    }
}