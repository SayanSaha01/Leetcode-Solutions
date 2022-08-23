class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int top[] = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int i: map.keySet())
            pq.add(i);

        for(int i=0; i< k;i++)
            top[i] = pq.remove();
        return top;
    }
}