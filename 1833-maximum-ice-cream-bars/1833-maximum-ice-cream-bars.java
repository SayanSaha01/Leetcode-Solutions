class Solution {
    public int maxIceCream(int[] costs, int coins) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i:costs)
        {
            pq.add(i);
        }
        int count=0;
       // while(coins>=0)      why this wont work if pq is empty and coins value is provided with something >0  then it will go inside the loop and count will increment and show 1
        while(!pq.isEmpty() && pq.peek()<=coins)    
//on the other hand if we only write(!pq.isEmpty()) then also it will throw error as suppose we reach the last and max element of the minheap then also it will go inside the loop and increment the count;
        {
            coins-=pq.poll();
            count++;
        }
        return count;
    }
}