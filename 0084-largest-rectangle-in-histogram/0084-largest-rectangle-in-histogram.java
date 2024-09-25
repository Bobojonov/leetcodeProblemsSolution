class Solution {
    public int largestRectangleArea(int[] heights) {
        int res = 0;
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            int l = i;
            while (!stack.isEmpty() && stack.peek()[1] > heights[i]) {
                int[] area = stack.pop();
                int idx = area[0];
                int height = area[1];
                res = Math.max(res, height * (i - idx));
                l = idx;
            }
            stack.push(new int[]{l, heights[i]});
        }
        
        for (int[] pair: stack) {
            int idx = pair[0];
            int height = pair[1];
            res = Math.max(res, height * (heights.length - idx));
        }
        return res;
    }
}