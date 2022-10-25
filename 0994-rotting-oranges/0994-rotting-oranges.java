class Solution {
    
    public int orangesRotting(int[][] grid) {
        Queue<Pair<Integer, Integer>> pq = new ArrayDeque();
        int count = 0;
        int r = grid.length, c = grid[0].length;
        int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        int minutes = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 2) pq.offer(new Pair(i, j));
                else if (grid[i][j] == 1) count++;
            }
        }
        pq.offer(new Pair(-1, -1));
        while (!pq.isEmpty()) {
            Pair<Integer, Integer> orange = pq.poll();
            int row = orange.getKey();
            int col = orange.getValue();
            if (row == -1) {
                minutes++;
                if (!pq.isEmpty()) pq.offer(new Pair(-1, -1));
            } else {
                for (int[] d: dir) {
                    int i = row + d[0];
                    int j = col + d[1];
                    if (i >= 0 && i < r && j >= 0 && j < c) {
                        if (grid[i][j] == 1) {
                            grid[i][j] = 2;
                            count--;
                            pq.offer(new Pair(i, j));
                        }
                    }
                }
            }
        }
        return count == 0 ? minutes - 1 : -1;
    }
}