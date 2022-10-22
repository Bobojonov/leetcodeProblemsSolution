class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 1; i < heights.length; i++) {
            int diff = heights[i] - heights[i - 1];
            if (diff > 0)
                queue.add(diff);
            if (queue.size() > ladders)
                bricks -= queue.poll();
            if (bricks < 0)
                return i - 1;
        }
        return heights.length - 1;
    }
}