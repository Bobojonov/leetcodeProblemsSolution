class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (List<Integer> w: wall) {
            int idx = 0;
            for (int i = 0; i < w.size() - 1; i++) {
                idx += w.get(i);
                map.put(idx, map.getOrDefault(idx, 0) + 1);
                res = Math.max(res, map.get(idx));
            }
        }
        return wall.size() - res;
    }
}