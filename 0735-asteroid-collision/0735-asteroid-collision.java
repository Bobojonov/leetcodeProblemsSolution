class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int sign = 0;
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0 || st.isEmpty() || st.peek() < 0)
                st.push(asteroids[i]);
            else if (st.peek() <= -asteroids[i])
                if (st.pop() < -asteroids[i]) i--;
        }
        return st.stream().mapToInt(i -> i).toArray();
    }
}