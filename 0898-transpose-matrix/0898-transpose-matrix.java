class Solution {
    public int[][] transpose(int[][] matrix) {
       int r = matrix.length;
        int c = matrix[0].length;
        int[][] res = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                res[i][j] = matrix[j][i];
            }
        }
        return res;
    }
}