class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Comparator<Integer> comp = new CustomCumparator();
        Arrays.sort(nums, comp);
        return Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
    }
}
class CustomCumparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (Integer.bitCount(o1) == Integer.bitCount(o2)) return o1 - o2;
        return Integer.bitCount(o1) - Integer.bitCount(o2);
    }
}