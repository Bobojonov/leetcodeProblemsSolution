class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int cnt = 0, pixels = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int pixel = widths[s.charAt(i) - 'a'];
            if (pixels + pixel <= 100) pixels += pixel;
            else {
                pixels = pixel;
                cnt++;
            }
        }
        int pixel = widths[s.charAt(s.length() - 1) - 'a'];
        if (pixels == 100) {
            return new int[] {cnt + 1, pixel};
        } else if (pixels + pixel <= 100) return new int[] {cnt + 1, pixel + pixels};
        else return new int[] {cnt + 2, pixel};
    }
}