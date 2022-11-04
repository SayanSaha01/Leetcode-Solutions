class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int max=0;
        for(char c:s.toCharArray())
        {
            if(map.containsKey(c))
            {
                max+=2;
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)
                    map.remove(c);
            }
            else
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        
        for(char c:map.keySet())
        {
            max+=1;
            break;
        }
        return max;
    }
}