class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        List<Integer> dp = triangle.get(triangle.size() - 1);
        System.out.println(dp);
        for (int i = len - 2; i >= 0; i --){
            List<Integer> currRow = new ArrayList<>();
            for (int j = 0; j <= i; j++){
                currRow.add(triangle.get(i).get(j) + Math.min(dp.get(j), dp.get(j + 1)));
            }
            dp = currRow;
        }
        return dp.get(0);
        
    }
}