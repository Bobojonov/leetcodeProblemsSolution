class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        return multi(num1, num2);
    }
    
    public String multi(String num1, String num2) {
        int len = num1.length() + num2.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len; i++)
            result.append(0);
        StringBuilder first = new StringBuilder(num1);
        StringBuilder second = new StringBuilder(num2);
        first.reverse();
        second.reverse();
        for (int i = 0; i < second.length(); i++) {
            int digit2 = second.charAt(i) -'0';
            for (int j = 0; j < first.length(); j++) {
                int digit1 = first.charAt(j) -'0';
                int pos = i + j;
                int sum = result.charAt(pos) - '0';
                int mult = digit1 * digit2 + sum;
                result.setCharAt(pos, (char)(mult % 10 + '0'));
                int value = (result.charAt(pos + 1) - '0') + mult / 10;
                result.setCharAt(pos + 1, (char)(value + '0'));
            }
        }
        if (result.charAt(result.length() - 1) == '0') result.deleteCharAt(result.length() - 1);
        result.reverse();
        return new String(result);
    }
}