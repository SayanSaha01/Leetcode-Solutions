class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i : arr) 
            map.put(i , map.getOrDefault(i,0)+1);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 

        for(int i : map.keySet()) 
            pq.add(map.get(i));

        int count = 0;
        int itemRemoved=arr.length;

        while(!pq.isEmpty()){
            count++;
            itemRemoved-=pq.remove();
            if(itemRemoved<=arr.length/2) 
                break;
        }
        return count;

    }
}