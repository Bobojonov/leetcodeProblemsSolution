class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) return n;
        int res = 0;
        for (int i = 0; i < n - res; i++) {
            int[] point1 = points[i];
            Map<Double, Integer> map = new HashMap<>(n - i, 1.0f);
            int max = 0;
            for (int j = i + 1; j < n; j++) {
                double slope = -1;
                int[] point2 = points[j];
                if (point1[0] == point2[0]) slope = Double.NaN;
                else if (point1[1] == point2[1]) slope = 0;
                else slope = (double) (point2[1] - point1[1]) / (point2[0] - point1[0]);
                int curr = map.getOrDefault(slope, 1) + 1;
                max = Math.max(max, curr);
                map.put(slope, curr);
            }
            res =  Math.max(res, max);
        }
        return res;
    }
}