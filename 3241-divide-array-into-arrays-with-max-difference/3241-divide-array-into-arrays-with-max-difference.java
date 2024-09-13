class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] arr = new int[nums.length / 3][3];
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 3) {
            if (i + 2 < nums.length && nums[i + 2] - nums[i] <= k) {
                result.add(Arrays.asList(nums[i], nums[i + 1], nums[i + 2]));
            } else return new int[][]{};
        }
        for (int i = 0; i < nums.length / 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = result.get(i).get(j);
            }
        }
        return arr;
    }
}