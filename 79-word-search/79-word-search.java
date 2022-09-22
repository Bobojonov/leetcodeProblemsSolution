class Solution {
    boolean[][] visited;
   public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0) && dfs(i, j, 0, board, word))
                    return true;
            }
        }
        return false;
    }

    public boolean dfs(int i, int j, int index, char[][] board, String word) {
        if (index == word.length()) return true;
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index) || visited[i][j])
            return false;
        visited[i][j] = true;
        if (dfs(i - 1, j, index + 1, board, word) ||
            dfs(i + 1, j, index + 1, board, word) ||
            dfs(i, j - 1, index + 1, board, word) ||
            dfs(i, j + 1, index + 1, board, word))
            return true;
        visited[i][j] = false;
        return false;
    }

}