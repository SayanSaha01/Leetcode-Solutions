class Solution {
    public int findClosestNumber(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<>(){
            @Override
            public int compare(Integer a,Integer b)
            {
                if(Math.abs(a-0)==Math.abs(b-0))
                    return Integer.compare(b,a);
                else
                    return Integer.compare(Math.abs(a-0),Math.abs(b-0));
            }
        });
        for(int n:nums)
        {
            pq.add(n);
        }
        return pq.poll();
    }
}