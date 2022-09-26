class Solution {
    public boolean equationsPossible(String[] equations) {
        List<Integer>[] graph = new ArrayList[26];
        for (int i = 0; i < 26; ++i)
            graph[i] = new ArrayList();
        for (String str: equations){
            if (str.charAt(1) == '='){
                int x = str.charAt(0) - 'a';
                int y = str.charAt(3) - 'a';
                graph[x].add(y);
                graph[y].add(x);
            }
        }
        int[] color = new int[26];
        Arrays.fill(color, -1);
        for (int i = 0; i < 26; i++){
            if (color[i] == -1) dfs(i, i, color, graph);
        }
        for (String str: equations) {
            if (str.charAt(1) == '!') {
                int x = str.charAt(0) - 'a';
                int y = str.charAt(3) - 'a';
                if (color[x] == color[y])
                    return false;
            }
        }
        return true;
    }
     public static void dfs(int node, int c, int[] color, List<Integer>[] graph){
        if (color[node] == -1){
            color[node] = c;
            for (int x: graph[node])
                dfs(x, c, color, graph);
        }
    }
}