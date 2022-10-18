class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for (int i = 1; i < numRows; i++){
            List<Integer> triangle = new ArrayList<>();
            List<Integer> prevTriangle = result.get(i - 1);
            triangle.add(1);
            for (int j = 1; j < i; j++)
                triangle.add(prevTriangle.get(j - 1) + prevTriangle.get(j));
            triangle.add(1);
            result.add(triangle);
        }
        return result;
    }
}