import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<words.length;i++)
        {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->map.get(a).equals(map.get(b))?b.compareTo(a):map.get(a)-map.get(b));
        for(String word:map.keySet())
        {
            pq.add(word);
            if(pq.size()>k)
                pq.remove();
        }
        List<String> list = new ArrayList<>();
        for(int i=1;i<=k;i++)
            list.add(0,pq.remove());
        return list;                                             
    }
}