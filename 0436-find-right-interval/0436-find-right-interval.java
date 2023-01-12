class Solution {
    public int[] findRightInterval(int[][] intervals) {
        if (intervals.length <= 1) return new int[]{-1};
        HashMap<int[], Integer> map = new HashMap<>();
        int n = intervals.length;
        int[][] endIntervals = Arrays.copyOf(intervals, n);
        for (int i = 0; i < n; i++)
            map.put(intervals[i], i);
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Arrays.sort(endIntervals, (a, b) -> a[1] - b[1]);
        int j = 0;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            while (j < n && intervals[j][0] < endIntervals[i][1]) j++;
            res[map.get(endIntervals[i])] = j == intervals.length ? -1 : map.get(intervals[j]);
        }
        return res;
    }
}