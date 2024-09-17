class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        int l = 0, r = 0;
        while (r < nums.length) {
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[r]) {
                dq.pollLast();
            }
            dq.offer(r);
            if (l > dq.peekFirst()) dq.pollFirst();
            if (r + 1 >= k) {
                res[l] = nums[dq.peekFirst()];
                l++;
            }
            r++;
        }
        return res;
    }
}