class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        List<Integer> pairs = new ArrayList<>();
        for (int spell : spells) {
            int l = 0, r = potions.length - 1;
            int index = potions.length;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if ((long) potions[mid] * spell >= success) {
                    index = mid;
                    r = mid - 1;
                } else l = mid + 1;
            }
            pairs.add(potions.length - index);
            System.out.println(index);
        }
        int[] res = new int[pairs.size()];
        for (int i = 0; i < pairs.size(); i++)
            res[i] = pairs.get(i);
        return res;
    }
}