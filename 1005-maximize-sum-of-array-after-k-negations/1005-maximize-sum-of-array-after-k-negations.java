class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int maxsum=0;
        for(int i:nums)
        {
            pq.add(i);
        }
        while(k-->0)
        {
            int min = pq.poll();
            min*=-1;
            pq.add(min);
        }
        while(!pq.isEmpty())
        {
            maxsum+=pq.poll();
        }
        return maxsum;
    }
}