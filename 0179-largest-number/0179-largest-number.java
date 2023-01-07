class Solution {
    private class ComparatorLargestNumber implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            String s1 = o1 + o2;
            String s2 = o2 + o1;
            return s2.compareTo(s1);
        }
    }
    public String largestNumber(int[] nums) {
         int n = nums.length;
        String[] chars = new String[n];
        for (int i = 0; i < n; i++)
            chars[i] = String.valueOf(nums[i]);
        Arrays.sort(chars, new ComparatorLargestNumber());
        if (chars[0].equals("0")) return "0";
        StringBuilder res = new StringBuilder();
        for (String ch: chars)
            res.append(ch);
        return res.toString();
    }
}