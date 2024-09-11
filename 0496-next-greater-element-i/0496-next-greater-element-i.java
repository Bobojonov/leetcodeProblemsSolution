class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int cnt = 0;
        
        for (int i = 0; i < nums1.length; i++) {
            res[cnt++] = counter(nums1[i], nums2);
        }
        return res;
    }
    
    public int counter(int i, int[] nums2) {
        for (int j = 0; j < nums2.length; j++) {
            if (nums2[j] == i) {
                for (int k = j + 1; k < nums2.length; k++) {
                    if (nums2[k] > i)
                        return nums2[k];
                }
            }
        }
        return -1;
    }
}