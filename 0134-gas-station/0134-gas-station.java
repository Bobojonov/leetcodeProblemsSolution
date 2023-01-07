class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int res = 0;
        int tank = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            res += gas[i] - cost[i];
            tank += gas[i] - cost[i];
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        return res >= 0 ? start : -1;
    }
}