class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> combination = new LinkedList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, combination, result);
        return result;
        
    }
    
    public void backtrack(int[] candidates, int target, int index, LinkedList<Integer> combination, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1])
                continue;
            int num = candidates[i];
            if (target - num < 0) break;
            combination.addLast(num);
            backtrack(candidates, target - num, i + 1, combination, result);
            combination.removeLast();
        }
    }
}