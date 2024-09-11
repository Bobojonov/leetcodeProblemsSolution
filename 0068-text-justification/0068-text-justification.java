class Solution {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        StringBuilder sb = new StringBuilder();
        List<List<String>> divide = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        int curr_length = 0;
        for (String word : words) {
            int len = word.length();
            if (curr_length + len + curr.size() < maxWidth) {
                curr_length += len;
                curr.add(word);
            } else if (curr_length + len + curr.size() == maxWidth) {
                curr.add(word);
                divide.add(new ArrayList<>(curr));
                curr = new ArrayList<>();
                curr_length = 0;
            } else {
                divide.add(new ArrayList<>(curr));
                curr = new ArrayList<>();
                curr.add(word);
                curr_length = len;
            }
        }
        if (!curr.isEmpty()) divide.add(new ArrayList<>(curr));
        System.out.println(divide);
        List<String> res = new ArrayList<>();
        for (int i = 0; i < divide.size(); i++) {
            res.add(fillLineWithSpaces(divide.get(i), maxWidth, i == divide.size() - 1));
        }
        return res;
    }

    public static String fillLineWithSpaces(List<String> list, int maxWidth, Boolean isLast) {
        StringBuilder sb = new StringBuilder();
        String[] str = new String[list.size()];
        int curr_length = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) str[i] = list.get(i);
            else str[i] = list.get(i) + " ";
            curr_length += str[i].length();
        }
        System.out.println(Arrays.toString(str) + "   herree");
        System.out.println(curr_length);
        int spaces = maxWidth - curr_length;
        System.out.println(spaces);
        if (list.size() == 1) {
            while (spaces > 0) {
                str[0] = str[0] + " ";
                spaces--;
            }
        } else if (!isLast) {
            while (spaces > 0) {
                for (int i = 0; i < str.length - 1; i++) {
                    if (spaces == 0) break;
                    str[i] = str[i] + " ";
                    spaces--;
                }
            }
        } else {
            while (spaces > 0) {
                str[str.length - 1] = str[str.length - 1] + " ";
                spaces--;
            }
        }
        for (String s : str) {
            sb.append(s);
        }
        return sb.toString();
    }
}