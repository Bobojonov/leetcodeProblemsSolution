class Solution {
    public boolean isPathCrossing(String path) {
        Map<Character, int[]> moves = new HashMap<>();
        moves.put('N', new int[]{0, 1});
        moves.put('S', new int[]{0, -1});
        moves.put('W', new int[]{-1, 0});
        moves.put('E', new int[]{1, 0});
        Set<List<Integer>> visited = new HashSet<>();
        visited.add(List.of(0, 0));
        System.out.println(visited.contains(List.of(0, 0)));
        int x = 0, y = 0;
        for (char p: path.toCharArray()) {
            int[] curr = moves.get(p);
            int dx = curr[0];
            int dy = curr[1];
            x += dx; y += dy;
            int[] pair = new int[]{x, y};
            if (visited.contains(List.of(x, y))) return true;
            visited.add(List.of(x, y));
        }
        return false;
    }
}