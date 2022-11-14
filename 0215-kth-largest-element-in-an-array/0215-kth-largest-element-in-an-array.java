class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int n = nums.length;
        for(int i:nums)
        {
            pq.add(i);
        }
        int x=0;
        while(k-->0)
        {
            x=pq.poll();
        }
        return x;
    }
}