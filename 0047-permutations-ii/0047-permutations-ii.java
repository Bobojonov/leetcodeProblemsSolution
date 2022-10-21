class Solution {
    int n;
    List<List<Integer>> result;
    public List<List<Integer>> permuteUnique(int[] nums) {
        this.n = nums.length;
        result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        for (int num: nums) combination.add(num);
        backtrack(0, combination);
        return result;
    }
    
    public void backtrack(int i, List<Integer> comb) {
        if (i == n) {
            if (result.contains(comb))
                return;
            else result.add(new ArrayList<>(comb));
        }
        for (int j = i; j < n; j++) {
            Collections.swap(comb, j, i);
            backtrack(i + 1, comb);
            Collections.swap(comb, j, i);
        }
    }
}