class Solution {
    public int findMaxK(int[] nums) {
        PriorityQueue<Integer> max = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<Integer>();
        for(int i:nums)
        {
            max.offer(i);
            min.offer(i);
        }
        while(!max.isEmpty())
        {
            int element = max.poll();
            if(min.contains(-element))
                return element;
        }
        return -1;
    }
}