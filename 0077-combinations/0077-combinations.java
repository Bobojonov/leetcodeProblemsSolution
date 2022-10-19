class Solution {
        List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(1, n, k, new LinkedList<Integer>());
        return result;
    }
    
    public void backtrack(int start, int n, int k, LinkedList<Integer> combination) {
        if (combination.size() == k)
            result.add(new ArrayList<>(combination));
        for (int i = start; i <= n; i++) {
            combination.add(i);
            backtrack(i + 1, n, k, combination);
            combination.removeLast();
        }
    }
}