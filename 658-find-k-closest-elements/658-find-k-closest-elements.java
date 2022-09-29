class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        for (int num: arr)
            result.add(num);
        Collections.sort(result, (a, b) -> Math.abs(a - x) - Math.abs(b - x));
        result = result.subList(0, k);
        Collections.sort(result);
        return result;
    }
}