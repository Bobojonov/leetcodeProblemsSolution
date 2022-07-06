class Solution {
    public boolean validWordSquare(List<String> words) {
        for (int i = 0; i < words.size(); i++){
            String str = words.get(i);
            System.out.println("STR = " + str);
            for (int j = 0; j < str.length(); j++){
                char ch1 = str.charAt(j);
                System.out.println("CH1 = " + ch1);
                if (j >= words.size() || i >= words.get(j).length()) return false;
                char ch2 = words.get(j).charAt(i);
                System.out.println("CH2 = " + ch2);
                if (ch1 != ch2) return false;
            }
        }
        return true;
    }
}