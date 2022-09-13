class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int val =map.get(s.charAt(0));
        
        for(int num : map.values()){
            if(num!=val)
                return false;
        }
        return true;
    }
}