class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int ones = 0, zeros = 0;
        for (int student : students) {
            if (student == 1) ones++;
            else zeros++;
        }
        for (int sandwich: sandwiches) {
            if (sandwich == 0) {
                if (zeros == 0) return ones;
                zeros--;
            } else {
                if (ones == 0) return zeros;
                ones--;
            }
        }
        return 0;
    }
}