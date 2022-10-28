class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i:barcodes)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->map.get(b)-map.get(a));
        for(int key:map.keySet())
        {
            pq.offer(key);
        }
        int[] result = new int[barcodes.length];
        int ind=0;
        while(!pq.isEmpty())
        {
           int val1 = pq.poll();
            result[ind++] = val1;
            if(pq.isEmpty()){
                break;
            }
            int val2 = pq.poll();
            result[ind++] = val2;
            if(map.get(val1) == 1){
                map.remove(val1);
            }
            else{
                map.put(val1, map.get(val1)-1);
                pq.offer(val1);
            }
            if(map.get(val2) == 1){
                map.remove(val2);
            }
            else{
                map.put(val2, map.get(val2)-1);
                pq.offer(val2);
            }
        }
        return result;
    }
}