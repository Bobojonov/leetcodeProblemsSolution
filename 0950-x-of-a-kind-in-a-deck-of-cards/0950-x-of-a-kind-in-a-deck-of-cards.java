class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> groups = new HashMap<>();
        for (int d : deck) {
            groups.put(d, groups.getOrDefault(d, 0) + 1);
        }
        int res = 0;
        for (int i : groups.values()) res = gcd(i, res);
        return res > 1;
    }
    public int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
}