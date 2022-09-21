class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0 && !visited[i][j]) {
                    visited[i][j] = true;
                    dfs(visited, i, j, matrix);
                }
            }
        }
    }

    public static void dfs(boolean[][] visited, int i, int j, int[][] matrix) {
        if (i < 0 || i > matrix.length - 1 || j < 0 && j > matrix[0].length - 1) return;
        int r = i + 1;
        while (r < matrix.length) {
            if (!visited[r][j]) {
                int temp = matrix[r][j];
                matrix[r][j] = 0;
                visited[r][j] = true;
                if (temp == 0) dfs(visited, r, j, matrix);
            }
            r++;
        }
        
        int c = j + 1;
        while (c < matrix[0].length) {
            if (!visited[i][c]) {
                int temp = matrix[i][c];
                matrix[i][c] = 0;
                visited[i][c] = true;
                if (temp == 0) dfs(visited, i, c, matrix);
            }
            c++;
        }
        r = i - 1;
        while (r >= 0) {
            if (!visited[r][j]) {
                int temp = matrix[r][j];
                matrix[r][j] = 0;
                visited[r][j] = true;
                if (temp == 0) dfs(visited, r, j, matrix);
            }
            r--;
        }

        c = j - 1;
        while (c >= 0) {
            if (!visited[i][c]) {
                int temp = matrix[i][c];
                matrix[i][c] = 0;
                visited[i][c] = true;
                if (temp == 0) dfs(visited, i, c, matrix);
            }
            c--;
        }
    }
}