class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<List<String>>();
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for(int i=0;i<strs.length;i++)
        {
            String str = strs[i];
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String nw = new String(arr);
            if(!map.containsKey(nw))
            {
                List<String> sublist = new ArrayList<String>();
                sublist.add(str);
                map.put(nw,sublist);
            }
            else
            {
                map.get(nw).add(str);
            }
        }
        for(String st:map.keySet())
        {
            list.add(map.get(st));
        }
        return list;
    }
}