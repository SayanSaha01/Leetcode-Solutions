class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map1 = new HashMap<String,Integer>();
        HashMap<String,Integer> map2 = new HashMap<String,Integer>();
        for(String w1:words1)
        {
            map1.put(w1,map1.getOrDefault(w1,0)+1);
        }
        for(String w2:words2)
        {
            map2.put(w2,map2.getOrDefault(w2,0)+1);
        }
        for(String w1:words1)
        {
            if(map1.containsKey(w1) && map1.get(w1)>1)
                map1.remove(w1);
        }
        for(String w2:words2)
        {
            if(map2.containsKey(w2) && map2.get(w2)>1)
                map2.remove(w2);
        }
        int count=0;
        for(String w1:words1)
        {
            if(map1.containsKey(w1) && map2.containsKey(w1))
                count++;
        }
        return count;
    }
}