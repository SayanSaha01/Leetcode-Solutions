class Solution {
    public int[] sortByBits(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Integer.bitCount(a)-Integer.bitCount(b)==0?Integer.compare(a,b):Integer.bitCount(a)-Integer.bitCount(b));
        for(int i:arr)
        {
            pq.offer(i);
        }
        int[] nums = new int[arr.length];
        int j=0;
        while(!pq.isEmpty())
        {
            nums[j++]=pq.poll();
        }
        return nums;
    }
}