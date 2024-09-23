class Solution {
    public int totalNQueens(int n) {
        return dfs(0, n, new boolean[n], new boolean[n * 2], new boolean[n * 2]);
    }

    public int dfs(int r, int n, boolean[] col, boolean[] posDig, boolean[] negDig) {
        if (r == n) {
            return 1;
        }
        int count = 0;
        for (int c = 0; c < n; c++) {
            int pos = r + c;
            int neg = r - c + (n - 1);
            if (col[c] || posDig[pos] || negDig[neg]) continue;
            col[c] = true;
            posDig[pos] = true;
            negDig[neg] = true;
            count += dfs(r + 1, n, col, posDig, negDig);
            col[c] = false;
            posDig[pos] = false;
            negDig[neg] = false;
        }
        return count;
    }
}