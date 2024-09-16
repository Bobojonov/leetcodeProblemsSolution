class Solution {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int res = 0, l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(String.valueOf(s.charAt(i)))) l++;
            if (i >= k && vowels.contains(String.valueOf(s.charAt(i - k))))
                l--;
            res = Math.max(res, l);
        }
        return res;
    }
}