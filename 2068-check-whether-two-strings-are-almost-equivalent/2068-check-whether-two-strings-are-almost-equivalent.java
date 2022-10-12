class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c:word1.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:word2.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)-1);
        }
        for(int i:map.values())
        {
            if(i>3 || i<-3)
                return false;
        }
        return true;
    }
}