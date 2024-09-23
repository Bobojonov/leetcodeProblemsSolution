class Solution {
    public int totalNQueens(int n) {
        Set<Integer> col = new HashSet<>();
        Set<Integer> posDig = new HashSet<>();
        Set<Integer> negDig = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row: board)
            Arrays.fill(row, '.');
        dfs(0, n, board, col, posDig, negDig, ans);
        return ans.size();
    }
    
    public void dfs(int r, int n, char[][] board, Set<Integer> col, Set<Integer> posDig, Set<Integer> negDig, List<Integer> ans) {
        if (r == n) {
            ans.add(1);
            return;
        }
        for (int c = 0; c < n; c++) {
            if (col.contains(c) || posDig.contains(r + c) || negDig.contains(r - c)) continue;
            col.add(c);
            posDig.add(r + c);
            negDig.add(r - c);
            board[r][c] = 'Q';
            dfs(r + 1, n, board, col, posDig, negDig, ans);
            col.remove(c);
            posDig.remove(r + c);
            negDig.remove(r - c);
            board[r][c] = '.';
        }
    }
}