class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int res = a ^ b;
            int temp = (a & b) << 1;
            a = res;
            b = temp;
        }
        return a;
    }
}