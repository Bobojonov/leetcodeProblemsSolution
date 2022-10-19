class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> comb = new ArrayList<>();
        int len = nums.length;
        for (int num: nums) comb.add(num);
        backtrack(len, comb, result, 0);
        return result;
    }
    public void backtrack(int len, List<Integer> comb, List<List<Integer>> result, int i) {
        if (i == len) result.add(new ArrayList<>(comb));
        for (int j = i; j < len; j++) {
            Collections.swap(comb, i, j);
            backtrack(len, comb, result, i + 1);
            Collections.swap(comb, i, j);
        }
    }
}