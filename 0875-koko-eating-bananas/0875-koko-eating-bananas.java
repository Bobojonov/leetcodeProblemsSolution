class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 1;
        for (int p: piles) r = Math.max(r, p);
        while (l < r) {
            int mid = (l + r) / 2;
            int spent_hours = 0;
            for (int p: piles)
                spent_hours += Math.ceil((double)p / mid);
            if (spent_hours <= h)
                r = mid;
            else
                l = mid + 1;
        }
        return r;
    }
}