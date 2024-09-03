class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int replacer = 0, n = chalk.length;
        while (k - chalk[replacer] >= 0) {
            k -= chalk[replacer];
            replacer++;
            if (replacer == n)
                replacer = 0;
            if (k <= 0) break;
        }
        return replacer;
    }
}