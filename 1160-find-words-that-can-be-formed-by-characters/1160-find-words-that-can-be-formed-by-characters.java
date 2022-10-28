class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> mapc = new HashMap<Character,Integer>();
        for(char c:chars.toCharArray())
        {
            mapc.put(c,mapc.getOrDefault(c,0)+1);
        }
        int ans=0;
        for(String str:words)
        {
         HashMap<Character,Integer> mapw = new HashMap<Character,Integer>();
            int count=0;
            for(char c:str.toCharArray())
            {
                mapw.put(c,mapw.getOrDefault(c,0)+1);
            }
            for(char r:mapw.keySet())
            {
                if(mapc.containsKey(r))
                {
                    if(mapc.get(r)>=mapw.get(r))
                    {
                        count+=mapw.get(r);
                    }
                }
            }
            if(count==str.length())
            {
                ans+=count;
            }
        }
        return ans;
    }
}