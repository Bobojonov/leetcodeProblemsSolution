class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Long> map = new HashMap<>();
        for (int[] ints : rectangles) {
            double rectangle = ints[1] * 1.0 / ints[0];
            map.put(rectangle, map.getOrDefault(rectangle, 0L) + 1);
        }
        long result = 0;
        for (Map.Entry<Double, Long> mp: map.entrySet()) {
            long n = mp.getValue();
            if (n > 1) result += n * (n - 1) / 2;
        }
        return result;
    }
}