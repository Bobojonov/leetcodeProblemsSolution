class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        int i = 0, n = groupSizes.length;
        int[] flag = new int[n];
        while (i < n) {
            int size = groupSizes[i];
            List<Integer> curr = new ArrayList<>();
            for (int j = i; j < n; j++) {
                if (curr.size() == size) {
                    break;
                }
                if (groupSizes[i] == groupSizes[j] && flag[j] == 0) {
                    curr.add(j);
                    flag[j] = 1;
                }
            }
            if (curr.size() == size) result.add(curr);
            i++;
        }
        return result;
    }
}