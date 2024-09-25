class Solution {
    public int bestClosingTime(String customers) {
        int score = 0, max_score = 0, index = -1;
        for (int i = 0; i < customers.length(); i++) {
            score += customers.charAt(i) == 'Y' ? 1 : -1;
            if (score > max_score) {
                max_score = score;
                index = i;
            }
        }
        return index + 1;
    }
}