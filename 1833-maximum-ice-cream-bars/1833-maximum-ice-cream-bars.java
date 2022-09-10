class Solution {
    public int maxIceCream(int[] costs, int coins) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i:costs)
        {
            pq.add(i);
        }
        int count=0;
       // while(coins>=0)      why this wont work if pq is empty then it will go inside the 
                             //loop  and count will increment and show 1
        while(!pq.isEmpty() && pq.peek()<=coins)
        {
            coins-=pq.poll();
            count++;
        }
        return count;
    }
}