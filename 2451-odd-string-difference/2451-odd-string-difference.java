class Solution {
    public String oddString(String[] words) {
        HashMap<List<Integer>,List<String>> map = new HashMap<>();
        for(int j=0;j<words.length;j++)
        {
            List<Integer> list = new ArrayList<>();
            char[] ch = words[j].toCharArray();
            for(int i=0;i<ch.length-1;i++)
            {
                list.add(ch[i+1]-ch[i]);
            }
            if(map.containsKey(list))
            {
                map.get(list).add(words[j]);
            }
            else
            {
                List<String> l = new ArrayList<>();
                l.add(words[j]);
                map.put(list,l);
            }
        }
        for(List<Integer> list : map.keySet())
        {
            if(map.get(list).size()==1)
                return map.get(list).get(0);
        }
        return "";
    }
}