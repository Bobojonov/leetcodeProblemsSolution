class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        for (int sticks: matchsticks) sum += sticks;
        if (sum % 4 != 0 || sum == 0) return false;
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        int side = sum / 4;
        int[] sides = {0, 0, 0, 0};
        return backtrack(0, side, sides, matchsticks);
        
    }

    public boolean backtrack(int start, int side, int[] sides, int[] matchsticks) {
        if (start == matchsticks.length) return true;
        int stick = matchsticks[start];
        for (int i = 0; i < 4; i++) {
            if (i > 0 && sides[i] == sides[i - 1]) continue;
            if (sides[i] + stick <= side) {
                sides[i] += stick;
                if (backtrack(start + 1, side, sides, matchsticks)) return true;
                sides[i] -= stick;
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