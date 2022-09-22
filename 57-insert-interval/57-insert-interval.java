class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int i = 0, len = intervals.length;
        while (i < len && intervals[i][1] < newInterval[0])
            list.add(intervals[i++]);
        while (i < len && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        list.add(newInterval);
        while (i < len) {
            list.add(intervals[i++]);
        }
        return list.toArray(new int[list.size()][2]);
    }
}