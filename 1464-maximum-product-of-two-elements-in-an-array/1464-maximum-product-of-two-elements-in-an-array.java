class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int n:nums)
        {
            if(pq.size()<2)
            {
                pq.add(n);
            }
            else
            {
                if(pq.peek()<n)
                {
                    pq.poll();
                    pq.add(n);
                }
            }
        }
        int x = pq.peek()-1;
        pq.remove();
        
        return (pq.peek()-1)*x;
    }
}