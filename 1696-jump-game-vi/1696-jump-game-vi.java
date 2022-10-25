class Solution {
    public int maxResult(int[] nums, int k) {
        int sum = nums[0];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        pq.add(new int[] {sum, 0});
        for (int i = 1; i < nums.length; i++) {
            while (pq.peek()[1] < i - k)
                pq.remove();
            sum = nums[i] + pq.peek()[0];
            pq.add(new int[] {sum, i});
        }
        return sum;
    }
}