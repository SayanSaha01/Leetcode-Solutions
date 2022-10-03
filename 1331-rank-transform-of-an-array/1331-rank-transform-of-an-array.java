class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] brr = new int[arr.length];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<arr.length;i++)  //0(n)
        {
            pq.add(arr[i]);  
        }
        int count=1;
        while(!pq.isEmpty())
        {
            int ele = pq.poll();
            if(!map.containsKey(ele))
            {
                map.put(ele,count++);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}