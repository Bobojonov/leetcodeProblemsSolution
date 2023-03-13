class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int max_time = 0;
        for (int t: time)
            max_time = Math.max(max_time, t);
        long l = 1, r = (long) max_time * totalTrips;
        while (l < r) {
            long mid = (l + r) / 2;
            if (haveTimeToFinish(time, mid, totalTrips))
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    public boolean haveTimeToFinish(int[] time, long givenTime, int totalTrips) {
        long currTrips = 0;
        for (int t: time)
            currTrips += givenTime / t;
        return currTrips >= totalTrips;
    }
}