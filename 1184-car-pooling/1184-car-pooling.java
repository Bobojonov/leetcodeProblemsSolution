class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr = new int[1001];
        for (int[] trip : trips) {
            arr[trip[1]] += trip[0];
            arr[trip[2]] -= trip[0];
        }
        for (int i = 0; i < 1001 && capacity >= 0; i++) {
            capacity -= arr[i];
        }
        System.out.println(capacity);
        return capacity >= 0;
    }
}