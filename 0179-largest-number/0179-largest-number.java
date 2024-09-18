class Solution {
   private static class CustomComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            String s1 = o1 + o2;
            String s2 = o2 + o1;
            return s2.compareTo(s1);
        }
    }
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] str = new String[n];
        for (int i = 0; i < nums.length; i++) str[i] = String.valueOf(nums[i]);
        Arrays.sort(str, new CustomComparator());
        if (str[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for (String s: str)
            sb.append(s);
        return sb.toString();
    }
}