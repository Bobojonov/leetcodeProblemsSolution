class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= target && matrix[i][matrix[0].length - 1] >= target) {
                int l = 0, r = matrix[0].length - 1;
                while (l <= r) {
                    int mid = l + (r - l) / 2;
                    if (matrix[i][mid] == target) return true;
                    if (matrix[i][mid] <= target) l++;
                    else r--;
                }
            }
        }
        return false;
    }
}