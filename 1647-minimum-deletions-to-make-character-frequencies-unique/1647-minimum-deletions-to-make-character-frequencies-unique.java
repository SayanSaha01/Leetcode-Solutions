class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count=0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int freq:map.values())
        {
            if(!set.contains(freq))
            {
                set.add(freq);
            }
            else
            {
                while(freq>0 && set.contains(freq))
                {
                    freq--;
                    count++;
                }
                set.add(freq);
            }
        }
        return count;
    }
}