class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }
        int i = 0,cnt = 0, diff;
        while (i < chars.length) {
            diff = 1;
            while (i < chars.length - 1 && chars[i] == chars[i + 1]){
                diff++;
                i++;
            }
            chars[cnt++] = chars[i];
            i++;
            if (diff > 1) {
                for (char ch: String.valueOf(diff).toCharArray())
                    chars[cnt++] = ch;
            }
        }
        return cnt;
    }
}