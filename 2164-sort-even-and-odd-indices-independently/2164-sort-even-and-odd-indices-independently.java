class Solution {
    public int[] sortEvenOdd(int[] nums) {
        PriorityQueue<Integer> odd = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> even = new PriorityQueue<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(i%2!=0)
                odd.offer(nums[i]);
            else
                even.offer(nums[i]);
        }
        int[] newnum = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i%2!=0)
                newnum[i]=odd.poll();
            else
                newnum[i]=even.poll();
        }
        return newnum;
    }
}