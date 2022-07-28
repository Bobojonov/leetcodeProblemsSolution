class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>(nums.length);
        Set<Integer> numSet = new HashSet<Integer>();
        for (int x: nums) numSet.add(x);
        for (int i = 1; i <= nums.length; i++){
            if (!numSet.contains(i)) list.add(i);
        }
        return list;
    }
}