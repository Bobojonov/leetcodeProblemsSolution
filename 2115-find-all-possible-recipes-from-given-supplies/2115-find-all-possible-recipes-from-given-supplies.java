class Solution {
    private static int unknown = 0;
    private static int being_cooked = 1;
    private static int be_cooked = 2;
    
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        HashMap<String, Integer> status = new HashMap<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < recipes.length; i++) {
            map.put(recipes[i], ingredients.get(i));
            status.put(recipes[i], unknown);
        }

        for (String supply: supplies)
            status.put(supply, be_cooked);
        List<String> result = new ArrayList<>();
        for (String recipe: recipes)
            dfs(recipe, map, status, result);
        return result;
        
    }
    public boolean dfs(String s, HashMap<String, List<String>> map, HashMap<String, Integer> status, List<String> result) {
        if (!status.containsKey(s)) return false;
        if (status.get(s) == being_cooked) return false;
        if (status.get(s) == be_cooked) return true;
        status.put(s, being_cooked);
        for (String m: map.get(s)) {
            if (!dfs(m, map, status, result)) return false;
        }
        status.put(s, be_cooked);
        System.out.println(status);
        result.add(s);
        return true;
    }
}