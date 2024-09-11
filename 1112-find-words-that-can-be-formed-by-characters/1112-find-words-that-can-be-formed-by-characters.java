class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] cnt = new int[26];
        for (char c: chars.toCharArray()) {
            cnt[c - 'a']++;
        }
        int result = 0;
        for (String word: words) {
            boolean valid = true;
            int[] clone = cnt.clone();
            for (int i = 0; i < word.length(); i++) {
                int c = word.charAt(i) - 'a'; 
                clone[c]--;
                if (clone[c] < 0) {
                    valid = false;
                    break;
                }
            }
            if (valid) result += word.length();
        }
        return result;
    }
}