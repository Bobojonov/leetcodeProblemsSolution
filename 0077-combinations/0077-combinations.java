class Solution {
        List<List<Integer>> result = new LinkedList();
        int n, k;
    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        backtrack(1, new LinkedList<Integer>());
        return result;
    }
    
    public void backtrack(int start, LinkedList<Integer> combination) {
        if (combination.size() == k)
            result.add(new LinkedList<>(combination));
        for (int i = start; i <= n; i++) {
            combination.add(i);
            backtrack(i + 1, combination);
            combination.removeLast();
        }
    }
}