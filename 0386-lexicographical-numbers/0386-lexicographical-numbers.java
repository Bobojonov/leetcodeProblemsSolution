class Solution {
    public List<Integer> lexicalOrder(int n) {
        Set<String> set = new TreeSet<>();
        for (int i = 1; i <= n; i++)
            set.add(String.valueOf(i));
        List<Integer> list = new ArrayList<>();
        for (String num: set)
            list.add(Integer.parseInt(num));
        return list;
    }
}