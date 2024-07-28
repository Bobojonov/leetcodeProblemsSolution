class Solution {
    public int finalValueAfterOperations(String[] operations) {
       int count = 0;
        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                count++;
            } else {
                count--;
            }
        }
        return count;
    }
}