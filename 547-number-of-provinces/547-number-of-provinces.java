class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] visited = new int[n];
        int provinces = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                dfs(i, visited, isConnected);
                provinces++;
            }
        }
        return provinces;
    }
    public static void dfs(int i, int[] visited, int[][] graph) {
        for (int j = 0; j < graph.length; j++) {
            if (graph[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(j, visited, graph);
            }
        }
    }
}