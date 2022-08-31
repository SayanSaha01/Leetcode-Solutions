class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int sum=0;
        for(int i=0;i<piles.length;i++)
        {
            pq.add(piles[i]);
            sum+=piles[i];
        }
        for(int j=0;j<k;j++)
        {
            int d=pq.poll();
            pq.add(d-d/2);
            sum-=d/2;
        }
        return sum;
    }
}