class Solution {
    public String revstring(String str)
    {
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        return rev;
    }
    public int longestPalindrome(String[] words) {
        int max=0;
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        for(String str:words)
        {
            String rev = revstring(str);
            if(map.containsKey(rev))
            {
                max+=4;
                map.put(rev,map.get(rev)-1);
                if(map.get(rev)==0)
                    map.remove(rev);
            }
            else
            {
                map.put(str,map.getOrDefault(str,0)+1);
            }
        }
        
        // for words in String words such as gg which is itself the reverse of itself it would have a palindrome but needs to be added to the string at the centre, 
        for(String s:map.keySet())
        {
        //the map would also contains redundant words such as ab which might have not any reverse present in words of ab such as ba, so we need to check if the word s in string is in itself a reverse of it or not, if yes we add +2 to it, there might be multiple words such as aa, xx ,yy present, we need to add only 1 such instance as all others would yield the same max length only
            if(s.equals(revstring(s)))
            {
                max+=2;
                break;
            }
        }
        return max;
    }
}