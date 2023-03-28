class Solution {
    int[] costs;
    Integer[] memo;
    Set<Integer> set;
    public int mincostTickets(int[] days, int[] costs) {
        this.costs = costs;
        memo = new Integer[366];
        set = new HashSet<>();
        for (int day: days) set.add(day);
        return dp(1);
    }

    public int dp(int i) {
        if (i > 365) return 0;
        if (memo[i] != null)
            return memo[i];
        int res;
        if (set.contains(i))
            res = Math.min(dp(i + 1) + costs[0], Math.min(dp(i + 7) + costs[1], dp(i + 30) + costs[2]));
        else res = dp(i + 1);
        memo[i] = res;
        return res;
    }
}