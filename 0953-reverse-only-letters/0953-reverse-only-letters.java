class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        int l = 0, r = s.length() - 1;
        while (l <= r) {
            char lChar = s.charAt(l);
            char rChar = s.charAt(r);
            if (!Character.isLetter(lChar)) {
                left.append(lChar);
                l++;
            } else if (!Character.isLetter(rChar)) {
                right.insert(0, rChar);
                r--;
            } else if(l == r) {
                left.append(rChar);
                l++;
            } else {
                left.append(rChar);
                right.insert(0, lChar);
                l++;
                r--;
            }
        }
        return left + right.toString();
    }
}