class Solution {
    public int countSquares(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] squares = new int[r][c];
        int count = 0;
        // count size == 1 
        for (int i = 0; i < r; i++){
            squares[i][0] = matrix[i][0];
            count += squares[i][0];
        }
        for (int i = 1; i < c; i++){
            squares[0][i] = matrix[0][i];
            count += squares[0][i];
        }
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matrix[i][j] == 1) {
                                        squares[i][j] = 1 + Math.min(Math.min(squares[i - 1][j - 1], squares[i][j - 1]), squares[i - 1][j]);

                    count += squares[i][j];
                }
            }
        }
        return count;
    }
}