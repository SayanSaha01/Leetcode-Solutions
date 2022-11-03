class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        int max=0;
        for(String str:words)
        {
            String flipped = "" + str.charAt(1) + str.charAt(0);
            if(map.containsKey(flipped))
            {
                max += 4;
                map.put(flipped,map.get(flipped)-1);
                if(map.get(flipped)==0)
                {
                    map.remove(flipped);
                }
            }
            else
            {
                map.put(str,map.getOrDefault(str,0)+1);
            }
        }
        
        for(char c='a';c<='z';c++)
        {
            if(map.getOrDefault(""+c+c,0)>0)
            {
                max+=2;
                break;
            }
        }
        return max;
    }
}