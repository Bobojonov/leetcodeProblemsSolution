class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        String sign = "";
        if (num < 0) {
            sign = "-";
            num = -num;
        }
        String result = "";
        while(num > 0) {
            result = (char)(48 + num % 7) + result;
            num /= 7;
        }
        return sign + result;
    }
}