class Solution {
    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> res = new ArrayList<>();
        divisors(2, n, new ArrayList<>(), res);
        return res;
    }
    public void divisors(int i, int n, List<Integer> list, List<List<Integer>> res) {
        if (n <= 1) {
            if (list.size() > 1) res.add(new ArrayList<>(list));
            return;
        }
        for (int j = i; j <= n; j++) {
            if (n % j == 0) {
                list.add(j);
                divisors(j, n / j, list, res);
                list.remove(list.size() - 1);
            }
        }
    }
}