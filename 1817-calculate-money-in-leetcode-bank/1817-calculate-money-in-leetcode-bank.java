class Solution {
    public int totalMoney(int n) {
        int week = n / 7, r = n % 7;
        int res = (week * (week - 1) / 2) * 7;
        res += week * 28;
        res += r * (r + 1) / 2 + week * r;
        return res;
    }
}