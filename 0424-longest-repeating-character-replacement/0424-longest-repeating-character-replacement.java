class Solution {
    public int characterReplacement(String s, int k) {
       int n = s.length();
        int start = 0, max_length = 0, max_count = 0;
        int[] tracker = new int[26];
        
        for (int end = 0; end < n; end++) {
            tracker[s.charAt(end) - 'A']++;
            int curr = tracker[s.charAt(end) - 'A'];
            max_count = Math.max(max_count, curr);
            while (end - start - max_count + 1 > k) {
                tracker[s.charAt(start) - 'A']--;
                start++;
            }
            max_length = Math.max(max_length, end - start + 1);
        }
        return max_length;
    }
}