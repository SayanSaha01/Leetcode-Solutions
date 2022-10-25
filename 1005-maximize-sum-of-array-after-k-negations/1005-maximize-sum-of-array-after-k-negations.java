class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i:nums)
        {
            pq.add(i);
        }
        while(k-->0)
        {
            int temp = pq.poll();
            temp*=-1;
            pq.add(temp);
        }
        int sum=0;
        while(!pq.isEmpty())
        {
            sum+=pq.poll();
        }
        return sum;
    }
}