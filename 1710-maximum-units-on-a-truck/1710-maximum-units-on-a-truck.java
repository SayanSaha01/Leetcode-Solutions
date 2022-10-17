class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int[] box: boxTypes)
        {
            pq.offer(box);
        }
        int total = 0;
        while(!pq.isEmpty() && truckSize>0)
        {
            int[] boxtype = pq.poll();
            total += Math.min(boxtype[0],truckSize)*boxtype[1];
            truckSize-=boxtype[0];
        }
        return total;
    }
}