class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x = coordinates[1][0] - coordinates[0][0];
        int y = coordinates[1][1] - coordinates[0][1];
        
        
        for(int i = 2; i < coordinates.length; i++){
            int x2 = coordinates[i][0] - coordinates[i - 1][0];
            int y2 = coordinates[i][1] - coordinates[i - 1][1];
            
            if(y * x2 != x * y2){
                return false;
            }
        }
        return true;
    }
}