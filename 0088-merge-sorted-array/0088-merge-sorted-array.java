class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = nums1.clone();
        int cnt = 0, l = 0, r = 0;
        while (l < m || r < n) {
            if (l < m && r < n && arr[l] <= nums2[r]) nums1[cnt++] = arr[l++];
            else if (l < m && r < n && arr[l] > nums2[r]) nums1[cnt++] = nums2[r++];
            else if (l < m) nums1[cnt++] = arr[l++];
            else  nums1[cnt++] = nums2[r++];
        }
    }
}