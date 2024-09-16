class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0, res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < fruits.length; i++) {
            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);
            while (map.size() > 2) {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if (map.get(fruits[l]) == 0) map.remove(fruits[l]);
                l++;
            }
            res = Math.max(res, i - l + 1);
        }
        return res;
    }
}