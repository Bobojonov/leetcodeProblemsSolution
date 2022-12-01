class Solution {
    public int calculateTime(String keyboard, String word) {
        int[] keys = new int[26];
        for (int i = 0; i < keyboard.length(); i++)
            keys[keyboard.charAt(i) - 'a'] = i;
        
        int prev = 0, cnt = 0;
        for (char c: word.toCharArray()) {
            cnt += Math.abs(prev - keys[c - 'a']);
            prev = keys[c - 'a'];
        }    
        
        return cnt;
    }
}