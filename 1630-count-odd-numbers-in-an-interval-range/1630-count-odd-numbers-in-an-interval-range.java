class Solution {
    public int countOdds(int low, int high) {
        if (low % 2 == 0) low++;
        int res = 0;
        while (low <= high) {
            res++;
            low += 2;
        }
        return res;
    }
}