class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int avg = rolls.length + n, sum = 0;
        int[] res = new int[n];
        for (int roll: rolls) sum += roll;
        int total = mean * avg - sum;
        if (total < n || total > 6 * n) return new int[0];
        int x = total / n;
        int r = total % n;
        Arrays.fill(res, x);
        for (int i = 0; i < r; i++) {
            res[i]++;
        }
        return res;
    }
}