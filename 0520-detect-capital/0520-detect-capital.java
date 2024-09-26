class Solution {
    public boolean detectCapitalUse(String word) {
        boolean f1 = true, f2 = true, f3 = true;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                f1 = false;
                break;
            }
        }
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                f2 = false;
                break;
            }
        }
        if (Character.isUpperCase(word.charAt(0))) {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    f3 = false;
                    break;
                }
            }
        } else {
            f3 = false;
        }
        return f1 || f2 || f3;
    }
}