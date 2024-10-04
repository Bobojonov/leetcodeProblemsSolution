class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int diff = (IntStream.of(aliceSizes).sum() - IntStream.of(bobSizes).sum()) / 2;
        HashSet<Integer> set = new HashSet<>();
        for (int alice: aliceSizes) set.add(alice);
        for (int bob: bobSizes) if (set.contains(bob + diff)) return new int[]{bob + diff, bob};
        return new int[]{0, 0};
    }
}