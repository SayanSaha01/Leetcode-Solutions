class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i:map.values())
        {
            pq.add(i);
        }
        int count=0;
        int size=arr.length;
        while(!pq.isEmpty())
        {
            int node=pq.poll();
            count++;
            size-=node;          //since it is mentioned a least half of the integers of the arrays are to be removed there is no harm if more than half of the integers are removed but after the immediate step we must stop hence the break cndition
            if(size<=arr.length/2)
                break;
        }
        return count;
    }
}