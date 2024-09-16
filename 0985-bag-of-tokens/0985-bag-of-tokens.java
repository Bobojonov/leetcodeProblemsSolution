class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int max = 0, point = 0, l = 0, r = tokens.length - 1;
        while (l <= r) {
            if (tokens[l] <= power) {
                power -= tokens[l];
                max = Math.max(max, ++point);
                l++;
            } else if (point > 0) {
                point--;
                power += tokens[r];
                r--;
            } else break;
        }
        return max;
    }
}