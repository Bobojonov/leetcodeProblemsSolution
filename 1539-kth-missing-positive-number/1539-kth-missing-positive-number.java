class Solution {
   public int findKthPositive(int[] arr, int k) {
        int n = 0, l, r, res = 1;
        while (k >= 1) {
            n++;
            l = 0; r = arr.length - 1;
            boolean f = false;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (arr[mid] == n) {
                    f = true;
                    break;
                } else if (arr[mid] < n)
                    l++;
                else r--;
            }
            if (!f) k--;
        }
        return n;
    }
}