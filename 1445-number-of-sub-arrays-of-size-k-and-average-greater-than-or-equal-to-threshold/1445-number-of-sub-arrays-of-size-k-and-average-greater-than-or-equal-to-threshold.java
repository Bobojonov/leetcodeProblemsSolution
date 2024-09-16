class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0, sum = 0, cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i - start + 1 == k) {
                if (sum / k >= threshold) cnt++;
                sum -= arr[start];
                start++;
            }
        }
        return cnt;
    }
}