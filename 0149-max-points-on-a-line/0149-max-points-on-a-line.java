class Solution {
    public int maxPoints(int[][] points) {
        if (points == null) return 0;
        if (points.length <= 2) return points.length;
        int res = 1;
        for (int i = 0; i < points.length; i++) {
            int[] point1 = points[i];
            int duplicates = 0;
            int max = 0;
            Map<String, Integer> map = new HashMap<>();
            for (int j = i + 1; j < points.length; j++) {
                int[] point2 = points[j];
                int dx = point2[0] - point1[0];
                int dy = point2[1] - point1[1];
                if (dx == 0 && dy == 0) {
                    duplicates++;
                    continue;
                }
                int gcd = gcd(dx, dy);
                dx /= gcd;
                dy /= gcd;
                if (dx < 0) {
                    dx = -dx;
                    dy = -dy;
                }
                String slope = dx + "/" + dy;
                map.put(slope, map.getOrDefault(slope, 0) + 1);
                max = Math.max(max, map.get(slope));
            }
            res = Math.max(res, max + duplicates + 1);
        }
        return res;
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}