class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n == 1) return 1;
        int res = 1;
        for (int i = 0; i < n; i++) {
            Map<Double, Integer> map = new HashMap<>();
            for (int j = i + 1; j < n; j++) {
                double slopes = findSlopes(points[i], points[j]);
                map.put(slopes, map.getOrDefault(slopes, 0) + 1);
                res = Math.max(res, map.get(slopes));
            }
        
        }
        return res + 1;
    }
    public double findSlopes(int[] point1, int[] point2) {
        int x1 = point1[0], x2 = point2[0];
        int y1 = point1[1], y2 = point2[1];
        if (x1 == x2) return Double.MAX_VALUE;
        if (y1 == y2) return 0;
        return (y2 - y1) * 1.0 / (x2 - x1);
    } 
}