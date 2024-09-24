class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int n = grid.length, m = grid[0].length;
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>(Collections.nCopies(m, 0));
            res.add(row);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x = (i + (j + k) / m) % n;
                int y = (j + k) % m;
                res.get(x).set(y, grid[i][j]);
            }
        }
        return res;
    }
}