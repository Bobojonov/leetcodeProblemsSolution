class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int res = 0;
        int[] seatsSorted = Arrays.stream(seats).sorted().toArray();
        int[] studentsSorted = Arrays.stream(students).sorted().toArray();
        for (int i = 0; i < seats.length; i++) {
            res += Math.abs(studentsSorted[i] - seatsSorted[i]);
        }
        return res;
    }
}