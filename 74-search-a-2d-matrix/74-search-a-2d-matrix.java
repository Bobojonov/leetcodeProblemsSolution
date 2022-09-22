class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int l = 0, r = matrix[0].length - 1;
            if (matrix[i][r] >= target) {
                while (l <= r) {
                    int mid = r - (r - l) / 2;
                    if (matrix[i][mid] == target) return true;
                    else if (matrix[i][mid] < target) l++;
                    else r--;
                }
            }
        }
        return false;
    }
}