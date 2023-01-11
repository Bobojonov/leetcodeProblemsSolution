class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for(int [] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        return dfs(adj, hasApple, 0, 0);
    }

    public int dfs(List<List<Integer>> adj, List<Boolean> hasApple, int idx, int parent) {
        int cnt = 0;
        for (int edge: adj.get(idx)) {
            if (edge == parent) continue;
            cnt += dfs(adj, hasApple, edge, idx);
        }
        if (idx != 0 && (hasApple.get(idx) || cnt > 0)) cnt += 2;
        return cnt;
    }
}