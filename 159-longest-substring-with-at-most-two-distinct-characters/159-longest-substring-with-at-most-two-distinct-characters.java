class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int len = s.length();
        if (len < 3) return len;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, longest = 2;
        while (right < len) {
            map.put(s.charAt(right), right++);
            if (map.size() == 3) {
                int del_idx = Collections.min(map.values());
                map.remove(s.charAt(del_idx));
                left = del_idx + 1;
            }
            longest = Math.max(longest, right - left);
        }
        return longest;
    }
}