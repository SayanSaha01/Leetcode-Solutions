class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> output = new ArrayList<Integer>();
        int start = 0;
        int end = p.length()-1;
        if(s.length()<p.length() || start>end)
            return output;
        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> pmap = new HashMap<>();
        
        for(int i=0;i<p.length();i++)
        {
            char ch = p.charAt(i);
            pmap.put(ch,pmap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<=end;i++)
        {
            char ch = s.charAt(i);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
        }
        if(smap.equals(pmap))
            output.add(start);
        
        start++;
        end++;
        
        while(end<s.length())
        {
            //add key at end
            char ch = s.charAt(end);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
            
            //remove key at start
            ch = s.charAt(start-1); //as before entering the while loop we do start++
            if(smap.containsKey(ch))
            {
                smap.put(ch,smap.get(ch)-1);
                
                if(smap.get(ch)==0)
                    smap.remove(ch);
            }
            if(smap.equals(pmap))
               output.add(start);
            
            start++;
            end++;
        }
        return output;
    }
}