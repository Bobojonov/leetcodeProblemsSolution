class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int res = 0;
        Arrays.sort(points, Comparator.comparing(a -> a[0]));
        for (int i = 0; i < points.length - 1; i++) {
            int curr = points[i + 1][0] - points[i][0];
            if (res < curr) res = curr;
        }
        return res;
    }
}