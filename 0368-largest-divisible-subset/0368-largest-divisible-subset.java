class Solution {
    HashMap<Integer, List<Integer>> map = new HashMap<>();

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        return dfs(nums, 0);
    }

    public List<Integer> dfs(int[] nums, int i) {
        if(map.containsKey(i))
            return map.get(i);
        List<Integer> maxLenLst = new ArrayList<>();
        int div = i == 0 ? 1 : nums[i-1];
        for(int k = i; k < nums.length; k++) {
            if(nums[k] % div == 0) {
                // make a copy is crucial here, so that we won't modify the returned List reference
                List<Integer> lst = new ArrayList<>(dfs(nums, k+1));
                lst.add(nums[k]);
                if(lst.size() > maxLenLst.size())
                    maxLenLst = lst;
            }
        }
        map.put(i, maxLenLst);
        return maxLenLst;
    }
}