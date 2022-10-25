class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        for (int num: matchsticks)
            sum += num;
        if (sum % 4 != 0 || sum == 0) return false;
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        int side = sum / 4;
        int[] sides = {0, 0, 0, 0};
        return dfs(matchsticks, sides, 0, side);
    }
    
    public boolean dfs(int[] nums, int[] sides, int idx, int side) {
        if (idx == nums.length) return true;
        int curr = nums[idx];
        for (int i = 0; i < 4; i++) {
            if (i > 0 && sides[i] == sides[i - 1])
                continue;
            if (sides[i] + curr <= side) {
                sides[i] += curr;
                if (dfs(nums, sides, idx + 1, side))
                    return true;
                sides[i] -= curr;
            }
        
        }
        return false;
    }
     public void reverse(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
}