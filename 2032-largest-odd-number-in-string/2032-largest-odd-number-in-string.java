class Solution {
    public String largestOddNumber(String num) {
        if ((num.charAt(num.length() - 1) - '0') % 2 == 1) return num;
        int i = num.length() - 1;
        while (i >= 0) {
            int last = num.charAt(i);
            if (last % 2 == 1) return num.substring(0, i + 1);
            i--;
        }
        return "";
    }
}