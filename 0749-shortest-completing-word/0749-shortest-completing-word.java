class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] count = new int[26];
        for (char plate: licensePlate.toCharArray())
            if (Character.isLetter(plate)) count[Character.toLowerCase(plate) - 'a']++;
        int min = Integer.MAX_VALUE;
        String res = "";
        for (String word: words) {
            int[] curr = new int[26];
            for (char w: word.toCharArray())
                curr[w - 'a']++;
            boolean flag = true;
            for (int i = 0; i < 26; i++) {
                if (count[i] > curr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag && word.length() < min) {
                res = word;
                min = word.length();
            }
        }
        return res;
    }
}