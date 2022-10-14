class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n =arr.length;
        int median = arr[(n-1)/2];
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(
        (x,y)->Math.abs(y-median)!=Math.abs(x-median)?
        Math.abs(y-median)-Math.abs(x-median):
        y-x);
        
        for(int ele:arr)
            pq.offer(ele);
        int[] res = new int[k];
        for(int i=0;i<k;i++)
        {
            res[i]=pq.poll();
        }
        return res;
    }
}