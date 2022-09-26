class Solution {
   static boolean[][] visited;

    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        visited = new boolean[r][c];
        int maxArea = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int currArea = dfs(i, j, grid);
                maxArea = Math.max(maxArea, currArea);
            }
        }
        return maxArea;
    }

    public static int dfs(int i, int j, int[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || visited[i][j] || grid[i][j] == 0)
            return 0;
        visited[i][j] = true;
        int area = 1 + dfs(i + 1, j, grid) + dfs(i - 1, j, grid) + dfs(i, j - 1, grid) + dfs(i, j + 1, grid);
        return area;
    }
}