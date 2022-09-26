class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);
        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                Stack<Integer> stack = new Stack<>();
                stack.push(i);
                color[i] = 0;

                while (!stack.isEmpty()) {
                    Integer node = stack.pop();
                    for (int edge: graph[node]) {
                        if (color[edge] == -1){
                            stack.push(edge);
                            color[edge] = color[node] ^ 1;
                        } else if (color[edge] == color[node]) return false;
                    }
                }
            }
        }
        return true;
    }
}