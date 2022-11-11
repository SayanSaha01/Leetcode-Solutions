class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:nums)
        {
            if(i%2==0)
            {
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(
        (a,b)->map.get(a)-map.get(b)==0
        ?a.compareTo(b)  //if they have some frequency then return smallest one
        :map.get(b)-map.get(a));   //else if they dont have the same frequency,return the one with the highest occurence
        
        for(int i:map.keySet())
        {
            pq.add(i);
        }
        return pq.size()==0?-1:pq.poll();
    }
}