class Solution {
    public boolean hasAlternatingBits(int n) {
        String x = Integer.toBinaryString(n);
        if (x.charAt(0) != '0') x = "0" + x;
        if (x.charAt(x.length() - 1) != '0') x = x + "0";
        for (int i = 1; i < x.length() - 1; i++) {
            if (x.charAt(i - 1) == x.charAt(i) || x.charAt(i + 1) == x.charAt(i)) return false;
        }
        return true;
    }
}