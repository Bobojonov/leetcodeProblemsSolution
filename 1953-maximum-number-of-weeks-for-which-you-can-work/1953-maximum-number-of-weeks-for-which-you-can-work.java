class Solution {
    public long numberOfWeeks(int[] milestones) {
        long sum = IntStream.of(milestones).asLongStream().sum(), max = IntStream.of(milestones).max().getAsInt();
        return Math.min(sum, 2 * (sum - max) + 1);
    }
}