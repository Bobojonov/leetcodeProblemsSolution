class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++)
            map.put(nums2[i], i);
        for (int i = 0; i < nums1.length; i++) {
            int el = nums1[i];
            nums1[i] = -1;
            for (int j = map.get(el); j < nums2.length; j++) {
                if (el < nums2[j]) {
                    nums1[i] = nums2[j];
                    break;
                }
            }
        }
        return nums1;
    }
}