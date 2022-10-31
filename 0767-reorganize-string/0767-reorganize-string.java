class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(char c:map.keySet())
        {
            pq.offer(c);
        }
        StringBuilder sb = new StringBuilder();
        while(pq.size()>1)
        {
            char first = pq.poll();
            char second = pq.poll();
            
            sb.append(first);
            sb.append(second);
            
            map.put(first,map.get(first)-1);
            map.put(second,map.get(second)-1);
            
            if(map.get(first)>0)
                pq.offer(first);
            if(map.get(second)>0)
                pq.offer(second);
        }
        while(!pq.isEmpty())
        {
            if(map.get(pq.peek())>1)
               return "";
            else
               sb.append(pq.poll());
        }
        return sb.toString();
    }
}