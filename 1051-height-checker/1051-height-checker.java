class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int key:heights)
        {
            pq.offer(key);
        }
        int i=0;
        while(!pq.isEmpty())
        {
            if(pq.poll()!=heights[i++])
                count++;
        }
        return count;
    }
}