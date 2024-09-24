class Solution {
    public String largestOddNumber(String num) {
        while (!num.isEmpty()) {
            int last = num.charAt(num.length() - 1) - '0';
            if (last % 2 == 1) return num;
            num = num.substring(0, num.length() - 1);
        }
        return "";
    }
}