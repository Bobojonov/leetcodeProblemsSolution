class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            for (int j = n - 1; j - i > 2 ; j--) {
                int l = i + 1;
                int r = j - 1;
                while (l < r) {
                    long sum = (long)nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target)
                        res.add(List.of(nums[i], nums[l++], nums[r--], nums[j]));
                    else if (sum < target) l++;
                    else r--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}