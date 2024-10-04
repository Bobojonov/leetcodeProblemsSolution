class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length()) return false;
        int j = 0, index = 0;
        for (int i = 0; i < name.length(); i++) {
            if (j == typed.length() || name.charAt(i) != typed.charAt(j)) return false;
            int count = 1;
            index = i;
            while (index + 1 < name.length() && name.charAt(index) == name.charAt(index + 1)) {
                count++;
                index++;
            }
            int countTyped = 0;
            while (j < typed.length() && name.charAt(i) == typed.charAt(j)) {
                countTyped++;
                j++;
            }
            if (count > countTyped) return false;
            i = index;
        }
        if (j != typed.length()) return false;
        return true;
    }
}