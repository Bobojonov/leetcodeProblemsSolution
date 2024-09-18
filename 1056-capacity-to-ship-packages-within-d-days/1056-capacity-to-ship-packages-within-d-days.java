class Solution {
    public int shipWithinDays(int[] weights, int days) {
        return binarySearch(weights, days);
    }
    
    public static int binarySearch(int[] weights, int days) {
        int sum = 0, max = 0;
        for (int weight: weights) {
            sum += weight;
            max = Math.max(max, weight);
        }
        int l = max, r = sum;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (canMake(mid, days, weights)) r = mid;
            else l = mid + 1;
        }
        return r;
    }
    
    public static boolean canMake(int mid, int days, int[] weights) {
        int day = 1, sum = 0;
        for (int weight: weights) {
            sum += weight;
            if (sum > mid) {
                day++;
                sum = weight;
            }
        }
        return day <= days;
    }
}