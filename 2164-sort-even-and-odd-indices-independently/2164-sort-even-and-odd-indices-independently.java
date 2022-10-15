class Solution {
    public int[] sortEvenOdd(int[] nums) {
        PriorityQueue<Integer> pqodd = new PriorityQueue<Integer>(Collections.reverseOrder());       //maxheap
        PriorityQueue<Integer> pqeven = new PriorityQueue<Integer>();
                                    //minheap
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                pqeven.offer(nums[i]);
            }
            else
            {
                pqodd.offer(nums[i]);
            }
        }
        int[] res = new int[nums.length];
        int index=0;
        while(index<nums.length)
        {
            if(index%2==0)
            {
                res[index++]=pqeven.poll();
            }
            else
            {
                res[index++]=pqodd.poll();
            }
        }
        return res;
    }
}