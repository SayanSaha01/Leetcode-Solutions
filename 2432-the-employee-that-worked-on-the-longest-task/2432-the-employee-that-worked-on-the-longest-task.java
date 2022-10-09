class Solution {
    public int hardestWorker(int n, int[][] logs) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        map.put(0,logs[0][1]);
        int x = logs[0][1];
        int max=x-0;
        for(int i=1;i<logs.length;i++)
        {
            map.put(i,logs[i][1]-x);
            max=Math.max(max,logs[i][1]-x);
            x=logs[i][1];
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i:map.keySet())
        {
            if(map.get(i)==max)
                pq.add(logs[i][0]);
        }
        return pq.poll();
    }
}