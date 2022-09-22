class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num: nums) {
            List<List<Integer>> subset = new ArrayList();
            for (List<Integer> set: result){
                subset.add(new ArrayList<>(set){{add(num);}});
                
            }

            for (List<Integer> set: subset){
                result.add(set);
            }
            // [] [1]
        }
        return result;
    }
}