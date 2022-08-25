class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int n:nums)
        {
            if(n>0)
              pq.add(n);
        }
        int res=0;
        while(!pq.isEmpty())
        {
            int d = pq.poll();
            pq.clear();
            for(int i=0;i<nums.length;i++)
            {
                nums[i]-=d;
                if(nums[i]>0)
                    pq.add(nums[i]);
            }
            res++;
        }
        return res;
    }
}