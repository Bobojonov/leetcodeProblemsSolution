class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] seen = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (seen[i] == 0) {
                dfs(isConnected, seen, i);
                cnt++;
            }
        }
        return cnt;
    }
    public void dfs(int[][] a, int[] seen, int i) {
        for (int j = 0; j < a.length; j++) {
            if (a[i][j] == 1 && seen[j] == 0) {
                seen[j] = 1;
                dfs(a, seen, j);
            }
        }
    }
}