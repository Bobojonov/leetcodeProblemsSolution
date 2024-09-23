class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices.length; j++) {
                if (i != j) {
                    int x = prices[i] + prices[j];
                    min = Math.min(x, min);
                }
            }
        }
        int sub = money - min;
        if (sub >= 0) return sub;
        else return money;
    }
}