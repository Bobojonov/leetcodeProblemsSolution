class Solution {
    public int maxWidthRamp(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int max = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (list.isEmpty() || nums[i] < nums[list.get(list.size() - 1)]) {
                list.add(i);
            } else {
                int l = 0, r = list.size() - 1, mid;
                while (l < r) {
                    mid = (l + r) / 2;
                    if (nums[list.get(mid)] > nums[i])
                        l = mid + 1;
                    else r = mid;
                }
                max = Math.max(max, i - list.get(l));
            }
        }
        return max;
    }
}