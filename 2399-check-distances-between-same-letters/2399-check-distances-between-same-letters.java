class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char[] str = s.toCharArray();
        for(int i=0;i<str.length;i++)
        {
            if(map.containsKey(str[i]))
            {
                int start = map.get(str[i]);
                int diff = i-1-start;
                if(distance[str[i]-'a']!=diff)
                    return false;
            }
            else
            {
                map.put(str[i],i);
            }
        }
        return true;
    }
}