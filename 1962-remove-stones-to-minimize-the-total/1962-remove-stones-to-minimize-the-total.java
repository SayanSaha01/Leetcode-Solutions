class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:piles)
            pq.offer(i);
        while(!pq.isEmpty() && k-->0)
        {
            int t = pq.poll();
            t -= (int)Math.floor(t/2);
            pq.offer(t);
        }
        int sum=0;
        while(!pq.isEmpty())
        {
            sum+=pq.poll();
        }
        return sum;
    }
}