class Solution {
    public int minSwaps(String s) {
        int closed = 0, res = 0;
        for (char c : s.toCharArray()) {
            if (c == ']') {
                closed++;
                res = Math.max(res, closed);
            } else closed--;
        }
        return (res + 1) / 2;
    }
}