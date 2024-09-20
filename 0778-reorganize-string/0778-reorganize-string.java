class Solution {
    public String reorganizeString(String s) {
        int[] chars = new int[26];
        for (char c: s.toCharArray())
            chars[c - 'a']++;
        int max = 0, c = 0;
        for (int i = 0; i < 26; i++) {
            if (chars[i] > max) {
                max = chars[i];
                c = i;
            }
        }
        if ((s.length() + 1) / 2 < max) return "";
        char[] res = new char[s.length()];
        int i = 0;
        while (0 < chars[c]) {
            res[i] = (char) (c + 'a');
            i += 2;
            chars[c]--;
        }
        for (int j = 0; j < 26; j++) {
            while (chars[j] > 0) {
                if (i >= res.length)
                    i = 1;
                res[i] = (char) (j + 'a');
                i += 2;
                chars[j]--;
            }
        }
        return String.valueOf(res);
    }
}