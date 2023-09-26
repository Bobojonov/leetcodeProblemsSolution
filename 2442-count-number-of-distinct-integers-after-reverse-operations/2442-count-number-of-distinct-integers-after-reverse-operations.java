class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for (int x: nums) {
            st.add(x);
            int n = 0;
            while (x > 0) {
                n = n * 10 + x % 10;
                x /= 10;
            }
            st.add(n);
        }
        return st.size();
    }
}