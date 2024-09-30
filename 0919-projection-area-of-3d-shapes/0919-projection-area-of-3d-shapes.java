class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length, x = 0, y = 0, z = 0;
        for (int i = 0; i < n; i++) {
            int currX = 0, currY = 0;
            for (int j = 0; j < n; j++) {
                currX = Math.max(currX, grid[j][i]);
                currY = Math.max(currY, grid[i][j]);
                if (grid[i][j] > 0) z++;
            }
            x += currX;
            y += currY;
        }
        return x + y + z;
    }
}