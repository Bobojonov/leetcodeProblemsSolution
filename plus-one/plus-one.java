class Solution {
    public int[] plusOne(int[] digits) {
        int count = 1;
        int j = 0;
        int remain = 1;
        String s = "";
        for (int i = digits.length - 1; i >= 0; i--){
            if (count == 1){
                if (digits[i] + 1 > 9){
                    count = 0;
                    s = "0" + s;
                    remain = 1;
                } else {
                    count = 0;
                    s = Integer.valueOf(digits[i] + remain) + s;
                    remain = 0;
                }
            } else {
                if (digits[i] + remain > 9){
                    count = 0;
                    s = "0" + s;
                    remain = 1;
                }else {
                    count = 0;
                    s = Integer.valueOf(digits[i] + remain) + s;
                    remain = 0;
                }
            }
        }
        if (remain == 1) s = "1" + s;
        int len = s.length();
        int[] new_digits = new int[len];
        for (int i = 0; i < len; i++) new_digits[i] = Character.getNumericValue(s.charAt(i));
        return new_digits;
    }
}