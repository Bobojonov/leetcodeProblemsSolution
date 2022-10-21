class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        int[] word2 = new int[26], temp;
        for (String w2: words2) {
            temp = convert(w2);
            for (int i = 0; i < 26; i++)
                word2[i] = Math.max(word2[i], temp[i]);
        }
        
        for (String w1: words1) {
            temp = convert(w1);
            int i;
            for (i = 0; i < 26; i++) {
                if (word2[i] > temp[i])
                    break;
            }
            if (i == 26) result.add(w1);
        }
        
        return result;
    }
    
    public int[] convert(String str) {
        int[] map = new int[26];
        for (char c: str.toCharArray())
            map[c - 'a']++;
        return map;
    }
}