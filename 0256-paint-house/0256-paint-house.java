class Solution {
    public int minCost(int[][] costs) {
        if (costs.length == 0) return 0;
        for (int n = costs.length - 2; n >= 0; n--) {
            costs[n][0] += Math.min(costs[n + 1][1], costs[n + 1][2]);
            costs[n][1] += Math.min(costs[n + 1][0], costs[n + 1][2]);
            costs[n][2] += Math.min(costs[n + 1][0], costs[n + 1][1]);
        }
        return Math.min(Math.min(costs[0][0], costs[0][1]), costs[0][2]);
    }
}