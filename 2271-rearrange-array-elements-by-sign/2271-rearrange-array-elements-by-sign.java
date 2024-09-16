class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            if (num > 0) pos.add(num);
            else neg.add(num);
        }
        int i = 0, j = 0;
        while (j < nums.length / 2) {
            res.add(pos.get(i));
            i++;
            res.add(neg.get(j));
            j++;
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}