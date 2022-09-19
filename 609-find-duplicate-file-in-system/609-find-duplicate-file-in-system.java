class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String, List <String> > map = new HashMap<>();
        for (String path: paths) {
            String[] split = path.split(" ");
            for (int i = 1; i < split.length; i++) {
                String[] file1 = split[i].split("\\(");
                file1[1] = file1[1].replace(")","");
                List<String> list = map.getOrDefault(file1[1], new ArrayList<String>());
                list.add(split[0] + "/" + file1[0]);
                map.put(file1[1], list);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (String key: map.keySet()) {
            if (map.get(key).size() > 1) result.add(map.get(key));
        }
        return result;
    }
}