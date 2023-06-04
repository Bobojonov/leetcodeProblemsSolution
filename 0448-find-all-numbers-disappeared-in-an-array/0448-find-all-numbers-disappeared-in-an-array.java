class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int[] dis = new int[n + 1]; 
        for (int x: nums)
            dis[x]++;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < n + 1; i++)
            if (dis[i] == 0) list.add(i);
        return list;
    }
}