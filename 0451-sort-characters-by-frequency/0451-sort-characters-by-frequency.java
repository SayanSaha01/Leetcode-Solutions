class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char str:s.toCharArray())
        {
            map.put(str,map.getOrDefault(str,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(char c:map.keySet())
        {
            pq.add(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty())
        {
            char d = pq.poll();
            for(int i=0;i<map.get(d);i++)
            {
                sb.append(d);
            }
        }
        return sb.toString();
    }
}