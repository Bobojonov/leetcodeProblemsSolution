class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int max = -1;
        res[n - 1] = max;
        for (int i = n - 2; i >= 0; i--) {
            max = Math.max(arr[i + 1], max);
            res[i] = max;
        }
        return res;
    }
}