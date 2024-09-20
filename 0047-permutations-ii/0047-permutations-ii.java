class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        for (int num: nums) comb.add(num);
        backtrack(0, nums, comb, res);
        return res;
    }
    
    public void backtrack(int start, int[] nums, List<Integer> comb, List<List<Integer>> res) {
        if (start == nums.length) {
            if (res.contains(comb)) return;
            res.add(new ArrayList<>(comb));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            Collections.swap(comb, i, start);
            backtrack(start + 1, nums, comb, res);
            Collections.swap(comb, i, start);
        }
    }
}