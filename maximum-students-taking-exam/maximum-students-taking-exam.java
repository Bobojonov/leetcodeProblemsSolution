class Solution {
    int r, c;
    int[][] ways = {{0, 1}, {0, -1}, {1, 1}, {1, -1},};
    Map<String, Integer> memo;

    public int maxStudents(char[][] seats) {
        r = seats.length;
        c = seats[0].length;
        memo = new HashMap<>();
        StringBuilder s = new StringBuilder();
        for (char[] row: seats) s.append(row);
        return dfs(s.toString());
    }

    public int dfs(String str) {
        if (memo.containsKey(str)) return memo.get(str);
        int res = 0;
        char[] s = str.toCharArray();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (s[i * c + j] == '.') {
                    s[i * c + j] = 'x';
                    res = Math.max(res, dfs(new String(s)));
                    for (int[] way: ways) {
                        int x = i + way[0], y = j + way[1];
                        if (x < 0 || y < 0 || x >= r || y >= c) continue;
                        if (s[x * c + y] == '.') s[x * c + y] = 'x';
                    }
                    res = Math.max(res, dfs(new String(s)) + 1);
                }
            }
        }
        memo.put(str, res);
        return res;
    }
}