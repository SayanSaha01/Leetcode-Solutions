class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        HashMap map = new HashMap<>();
            
        map.put("type",0);
        map.put("color",1);
        map.put("name",2);
        int actualCount = (int) map.get(ruleKey);
        int count = 0;

        for (int col = 0; col < items.size(); col++) {
            if (items.get(col).get(actualCount).equals(ruleValue)) {
                count++;
            }
        }
        
        return count;
    }
}