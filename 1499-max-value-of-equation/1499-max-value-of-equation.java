class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
         PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            return (b[1] - b[0]) - (a[1] - a[0]);
        });
        int ans = Integer.MIN_VALUE;
        for(int i = 0;i<points.length;i++){
            while(!pq.isEmpty() && points[i][0] - pq.peek()[0] > k){
                pq.poll();
            }
            if(!pq.isEmpty()){
                int temp[] = pq.peek();
                ans = Math.max(ans, temp[1] - temp[0] + points[i][0] + points[i][1]);
            }
            pq.offer(new int[]{points[i][0], points[i][1]});
        }
        // PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
        //     return b - a;
        // });
        
        
        return ans;
    }
}