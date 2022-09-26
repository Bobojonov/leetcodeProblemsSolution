class Solution {
    public int[] findRedundantConnection(int[][] edges) {
         UnionFind uf = new UnionFind(edges.length + 1);
        for (int[] edge: edges) {
            int parent1 = uf.find(edge[0]);
            int parent2 = uf.find(edge[1]);
            if (parent1 == parent2) return edge;
            uf.union(parent1, parent2);
        }
        return new int[] {-1, -1};
    }
     class UnionFind {
        public int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }

        public void union(int x, int y){
            parent[y] = x;
        }

        public int find(int x) {
            while (parent[x] != x) x = parent[x];
            return x;
        }
    }
}