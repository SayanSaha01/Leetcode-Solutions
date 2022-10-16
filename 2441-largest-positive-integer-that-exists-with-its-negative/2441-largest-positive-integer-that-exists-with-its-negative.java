class Solution {
    public int findMaxK(int[] nums) {
        PriorityQueue<Integer> max = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums)
        {
            max.offer(i);
            set.add(i);
            min.offer(i);
        }
        while(!max.isEmpty())
        {
            int element = max.poll();
            if(set.contains(-element))
                return element;
        }
        return -1;
    }
}