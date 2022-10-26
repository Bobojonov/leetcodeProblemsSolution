class Solution {
    public int findMinDifference(List<String> timePoints) {
        int min = Integer.MAX_VALUE;
       List<Integer> list = new ArrayList<>();
       for (int i = 0; i < timePoints.size(); i++) {
           int hour = Integer.valueOf(timePoints.get(i).substring(0, 2));
           list.add(hour * 60 + Integer.valueOf(timePoints.get(i).substring(3, 5)));
       }

       Collections.sort(list , (a, b) -> a - b);
       for (int i = 1; i < list.size(); i++)
           min = Math.min(min, list.get(i) - list.get(i - 1));
       int result = list.get(0) + (1440 - list.get(list.size() - 1));
       return Math.min(result, min);
    }
}