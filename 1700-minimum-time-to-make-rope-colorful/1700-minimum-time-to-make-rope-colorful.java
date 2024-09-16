class Solution {
    public int minCost(String colors, int[] neededTime) {
        int res = 0;
        int i = 0, j = 0;
        while (i < neededTime.length) {
            int curr = 0, max = 0;
            while (j < neededTime.length && colors.charAt(i) == colors.charAt(j)) {
                curr += neededTime[j];
                max = Math.max(max, neededTime[j]);
                j++;
            }
            res += curr - max;
            i = j;
        }
        return res;
    }
}