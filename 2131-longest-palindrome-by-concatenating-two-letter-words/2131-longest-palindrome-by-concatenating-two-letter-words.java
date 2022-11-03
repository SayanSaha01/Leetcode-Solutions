class Solution {
    public String revstring(String st)
    {
        String rev="";
        for(int i=st.length()-1;i>=0;i--)
        {
            rev+=st.charAt(i);
        }
        return rev;
    }
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        int max=0;
        for(String str:words)
        {
            String flipped = revstring(str);
            //as it is mentioned in the question each word is of length two , hence to find the palindrome we are adding charAt(1)+charAt(0)
            if(map.containsKey(flipped))
            {
                max += 4; 
//why we are adding 4 -> suppose word is ab then its flipped is ba and if String[] words contains ab and ba then the length of the palindromic string will be 4 (ab......ba)
                
                map.put(flipped,map.get(flipped)-1);
    //we dont know the number of times, flipped occurs in map hence reducing its count by 1, if somehow value of flipped becomes 0 in map we remove it so that it doesnt return 0 everytime
                if(map.get(flipped)==0)
                {
                    map.remove(flipped);
                }
            }
            else
    //if the map doesnt contain the reverse of a word then we just add the original word in map
            {
                map.put(str,map.getOrDefault(str,0)+1);
            }
        }
        
        for(String s:map.keySet())
        {
            if(map.get(s)==1 && (s.equals(revstring(s))))
            {
                max+=2;
                break;
            }
        }
        return max;
    }
}