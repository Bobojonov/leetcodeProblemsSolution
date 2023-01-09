class Solution {
    static int[][] dir = {{0, 1}, {-1, 0}, {1, 0}, {0, -1}};
    public void solve(char[][] board) {
        if (board.length == 0) return;
        int r = board.length;
        int c = board[0].length;
        for (int i = 0; i < r; i++) {
            if (board[i][0] == 'O')
                dfs(i, 0, board);
            if (board[i][c - 1] == 'O')
                dfs(i, c - 1, board);
        }
        for (int j = 0; j < c; j++) {
            if (board[0][j] == 'O')
                dfs(0, j, board);
            if (board[r - 1][j] == 'O')
                dfs(r - 1, j, board);
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == '*')
                    board[i][j] = 'O';
                else if (board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
    }
    public void dfs(int i, int j, char[][] board) {
        board[i][j] = '*';
        for (int[] d: dir) {
            int x = i + d[0];
            int y = j + d[1];
            if (x >= 0 && x < board.length && y >= 0 && y < board[0].length && board[x][y] == 'O')
                dfs(x, y, board);
        }
    }
}