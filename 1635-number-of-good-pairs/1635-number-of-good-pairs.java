class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] arr = new int[101];
        for (int num : nums) {
            arr[num]++;
        }
        int res = 0;
        for (int i = 0; i < 101; i++) {
            int n = arr[i];
            res += n * (n - 1) / 2;
        }
        return res;
    }
}