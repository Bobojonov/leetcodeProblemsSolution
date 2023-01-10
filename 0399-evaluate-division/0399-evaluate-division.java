class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, Map<String, Double>> map = new HashMap<>();
        for (int i = 0; i < values.length; i++) {
            String x = equations.get(i).get(0);
            String y = equations.get(i).get(1);
            map.putIfAbsent(x, new HashMap<>());
            map.putIfAbsent(y, new HashMap<>());
            map.get(x).put(y, values[i]);
            map.get(y).put(x, 1 / values[i]);
        }
        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String x = queries.get(i).get(0);
            String y = queries.get(i).get(1);
            result[i] = dfs(x, y, 1, map, new HashSet<>());
        }
        return result;
    }

    double dfs(String x, String y, double r, Map<String, Map<String, Double>> map, Set<String> seen) {
        if (!map.containsKey(x) || !seen.add(x)) return -1;
        if (x.equals(y)) return r;
        Map<String, Double> edge = map.get(x);
        for (String e: edge.keySet()) {
            double res = dfs(e, y, r * edge.get(e), map, seen);
            if (res != -1) return res;
        }
        return -1;
    }
}