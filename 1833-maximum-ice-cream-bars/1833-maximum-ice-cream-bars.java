class Solution {
    public int maxIceCream(int[] costs, int coins) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int count=0;
        for(int i:costs)
        {
            pq.offer(i);
        }
        while(!pq.isEmpty() && pq.peek()<=coins)
        {
            coins-=pq.poll();
            count++;
        }
        return count;
    }
}