class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<Double>(Collections.reverseOrder());
        double sum=0;
        for(int i:nums)
        {
            pq.add((double)i);
            sum+=(double)i;
        }
        double half = sum/2;
        int count=0;
        while(sum>half)
        {
            double d = pq.poll();
            d=d/2;
            sum-=d;
            count++;
            pq.add(d);
        }
        return count;
    }
}