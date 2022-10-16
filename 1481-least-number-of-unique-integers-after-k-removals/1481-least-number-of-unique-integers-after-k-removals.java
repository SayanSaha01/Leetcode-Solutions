class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->(map.get(a)-map.get(b)));
        for(int key:map.keySet())
        {
            pq.offer(key);
        }
        while(k>0 && !pq.isEmpty())
        {
            k-=map.get(pq.poll());
        }
        return k<0?pq.size()+1:pq.size();
    }
}