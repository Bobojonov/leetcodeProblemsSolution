class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int r = matrix.length, c = matrix[0].length;
        int[][] sub_sum = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int top = 0, left = 0, top_left = 0;
                if (i > 0) top = sub_sum[i - 1][j];
                if (j > 0) left = sub_sum[i][j - 1];
                if (i > 0 && j > 0) top_left = sub_sum[i - 1][j - 1];
                sub_sum[i][j] = matrix[i][j] + top + left - top_left;
            }
        }
        int result = 0;
        for (int i = 0; i < r; i++) {
            for (int j = i; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    for (int l = k; l < c; l++) {
                        int top = 0, left = 0, top_left = 0;
                        if (i > 0) top = sub_sum[i - 1][l];
                        if (k > 0) left = sub_sum[j][k - 1];
                        if (i > 0 && k > 0) top_left = sub_sum[i - 1][k - 1];
                        int curr = sub_sum[j][l] - top - left + top_left;
                        if (curr == target) result++;
                    }
                }
            }
        }
        return result;
    }
}