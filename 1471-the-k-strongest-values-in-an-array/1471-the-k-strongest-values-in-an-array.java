class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int median = arr.length % 2 == 0 ? arr[arr.length/2 - 1] : arr[arr.length/2];
        PriorityQueue<Integer> queue = new PriorityQueue<>((x,y) ->Math.abs(y-median)!=Math.abs(x-median) ? Math.abs(y-median) - Math.abs(x-median) : y-x);
        for(int a: arr) queue.offer(a);
        int[] result = new int[k];
        for(int i=0; i < k; i++) result[i] = queue.poll();
        return result;
    }
}