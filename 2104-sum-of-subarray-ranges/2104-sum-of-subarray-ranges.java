class Solution {
    public long subArrayRanges(int[] nums) {
        
        long sum=0;
        for(int i=0;i<nums.length;i++)
        {
            PriorityQueue<Integer> max = new PriorityQueue<Integer>(Collections.reverseOrder());
            PriorityQueue<Integer> min = new PriorityQueue<Integer>();
            for(int j=i;j<nums.length;j++)
            {
                min.add(nums[j]);
                max.add(nums[j]);
                sum+= Math.abs(max.peek()-min.peek());
            }
        }
        
        return sum;
    }
}