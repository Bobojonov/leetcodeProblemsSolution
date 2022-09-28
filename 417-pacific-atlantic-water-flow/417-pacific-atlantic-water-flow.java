class Solution {
    private static final int[][] DIRECTIONS = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    private int r;
    private int c;
    private int[][] landHeights;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
         if (heights == null || heights.length == 0) return new ArrayList<>();
        r = heights.length;
        c = heights[0].length;
        landHeights = heights;
        boolean[][] pacificReacheable  = new boolean[r][c];
        boolean[][] atlanticReacheable = new boolean[r][c];
        for (int i = 0; i < r; i++){
            dfs(i, 0, pacificReacheable);
            dfs(i, c - 1, atlanticReacheable);
        }

        for (int i = 0; i < c; i++){
            dfs(0, i, pacificReacheable);
            dfs(r - 1, i, atlanticReacheable);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (pacificReacheable[i][j] && atlanticReacheable[i][j]) result.add(List.of(i, j));
            }
        }
        return result;
    }
     public void dfs(int i, int j, boolean[][] reachable) {
        reachable[i][j] = true;
        for (int[] dir: DIRECTIONS) {
            int newRow = i + dir[0];
            int newCol = j + dir[1];
            if (newRow < 0 || newCol < 0 || newRow >= r || newCol >= c) continue;
            if (reachable[newRow][newCol]) continue;
            if (landHeights[newRow][newCol] < landHeights[i][j]) continue;
            dfs(newRow, newCol, reachable);
        }
    }
}