class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int start=0;
        int end=nums.length-1;
        while(start<end)
        {
            pq.offer(nums[start]+nums[end]);
            start++;
            end--;
        }
        return pq.poll();
    }
}