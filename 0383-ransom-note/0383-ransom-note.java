class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] construct = new int[26];
        for (int i = 0; i < magazine.length(); i++)
            construct[magazine.charAt(i) - 'a']++;
        for (int i = 0; i < ransomNote.length(); i++) {
            if (construct[ransomNote.charAt(i) - 'a'] - 1 < 0) return false;
            construct[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }
}