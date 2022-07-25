class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        List<List<String>> lists = new ArrayList<List<String>>();
        for(String word:strs)
        {
            char[] charray = word.toCharArray();
            Arrays.sort(charray);
            String key = new String(charray);
            if(!map.containsKey(key))
            {
                List<String> newList = new ArrayList<String>();
                newList.add(word);
                map.put(key,newList);
            }
            else
            {
                map.get(key).add(word);
            }
        }
        for(List<String> list:map.values())
            lists.add(list);
        return lists;
    }
}