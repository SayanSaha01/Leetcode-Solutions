class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.replaceAll("[, ?.@!;']+"," ").toLowerCase().split(" ");
        
        HashSet<String> set = new HashSet<String>();
        for(String str:banned)
        {
            set.add(str);
        }
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        for(String wrd:words)
        {
            if(!set.contains(wrd))
            {
                map.put(wrd,map.getOrDefault(wrd,0)+1);
            }
            else{
                map.put(wrd,1);
            }
        }
        int max=0;
        String key="";
        for(String st:map.keySet())
        {
            if(map.get(st)>max)
            {
                max=map.get(st);
                key=st;
            }
        }
        return key;
    }
}