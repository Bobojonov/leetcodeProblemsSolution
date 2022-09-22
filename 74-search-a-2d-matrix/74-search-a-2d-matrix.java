class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length - 1;
        int c = 0;
        while (c < matrix[0].length && r >= 0) {
            if (matrix[r][c] > target) 
                r--;
            else if (matrix[r][c] < target)
                c++;
            else return true;
        }
        return false;
    }
}