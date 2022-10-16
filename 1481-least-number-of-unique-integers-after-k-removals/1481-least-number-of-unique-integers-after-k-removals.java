class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->(map.get(a)-map.get(b)));    //puts elements into the queue on the basis of occurences of each element, element with least occurence is placed at the top
        for(int key:map.keySet())
        {
            pq.offer(key);
        }
        while(k>0 && !pq.isEmpty())
        {
            k-=map.get(pq.poll());     //we should decrement the value of k by 1 however, we are not decrementing the value of k by 1 rather we are subtracting from k, the element having the least number of occurence obtained by popping the priority queue
        }
        return k<0?pq.size()+1:pq.size();   //if accidentally the value of k becomes less than 0, then it means that the element at the top of the priority queue has more occurences than what actually needs to be subtracted,hence we do pq.size()+1, otherwise when k<0, we had subtracted pq.poll() from k thereby popping 1 element from the queue which would have reduced the size, hence we print pq.size()+1
    }
}