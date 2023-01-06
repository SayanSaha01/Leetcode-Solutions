class Solution {
    public boolean canReorderDoubled(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->Math.abs(a)-Math.abs(b));
        for(int num:arr)
        {
            pq.add(num);
        }
        while(!pq.isEmpty())
        {
            int node = pq.poll();
            if(!pq.remove(node*2))
                return false;
        }
        return true;
    }
}