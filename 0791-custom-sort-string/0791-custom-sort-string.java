class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(char c:order.toCharArray())
        {
            
            if(map.containsKey(c))
            {
                int val=map.get(c);
                while(val-->0)
                {
                    sb.append(c);
                }
                map.remove(c);
            }
        }
        for(char c:map.keySet())
        {
            if(map.get(c)>0)
            {
                int val = map.get(c);
                while(val-->0)
                    sb.append(c);
                
            }
        }
        return sb.toString();
    }
}