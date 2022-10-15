class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n =arr.length;
        int median = arr[(n-1)/2];    //the median is the element in position ((n - 1) / 2) in the sorted list (0-indexed).
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y)->
        Math.abs(y-median)!=Math.abs(x-median)?
        Math.abs(y-median)-Math.abs(x-median):
        y-x);
                                                        
        int[] res = new int[k];
        for(int i:arr)
            pq.offer(i);
        for(int i=0;i<k;i++)
        {
            res[i]=pq.poll();
        }
        return res;
    }
}