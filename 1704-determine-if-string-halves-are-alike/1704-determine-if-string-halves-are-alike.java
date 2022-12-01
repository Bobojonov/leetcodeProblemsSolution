class Solution {
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        int cnt = 0;
        String vowel = "AEIOUaeiou";
        for (int i = 0; i < len; i++) {
            if (i < len / 2) {
                if (vowel.indexOf(s.charAt(i)) != -1)
                    cnt++;
                else continue;
            }
            else if (vowel.indexOf(s.charAt(i)) != -1)
                cnt--;
        }
        System.out.println(cnt);
        return cnt == 0;
    }
}