class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        int n = nums.length;
        if (n == 1) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        helper(0, nums, new ArrayList<>(), res);
        return res;
    }
    public void helper(int idx, int[] nums, List<Integer> curr, List<List<Integer>> res) {
        if (curr.size() > 1) res.add(new ArrayList<>(curr));
        Set<Integer> set = new HashSet<>();
        for (int i = idx; i < nums.length; i++) {
            if (set.contains(nums[i])) continue;
            if (curr.size() == 0 || nums[i] >= curr.get(curr.size() - 1)) {
                set.add(nums[i]);
                curr.add(nums[i]);
                helper(i + 1, nums, curr, res);
                curr.remove(curr.size() - 1);
            }
        }
    }
}