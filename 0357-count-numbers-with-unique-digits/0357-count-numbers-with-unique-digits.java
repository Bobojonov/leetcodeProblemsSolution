class Solution {
    public int countNumbersWithUniqueDigits(int n) {
         if (n == 0) return 1;
        int cnt = 10;
        int uniqueDigits = 9;
        int numbers = 9;
        while (n -- > 1 && numbers > 0) {
            uniqueDigits = uniqueDigits * numbers;
            cnt += uniqueDigits;
            numbers--;
        }
        return cnt;
    }
}