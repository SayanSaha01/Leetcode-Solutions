class Solution {
    public long findScore(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(
        (i1,i2)->{
            if(nums[i1] == nums[i2]){
                return i1 - i2;
            }
            return nums[i1] - nums[i2];
        });
        int n = nums.length;
        long score=0;
        for(int i=0;i<nums.length;i++)
        {
            pq.add(i);
        }
        boolean[] visited = new boolean[n];
        while(!pq.isEmpty())
        {
            int i = pq.poll();
            if(visited[i]==true)
                continue;
            score+=nums[i];
            if(i>0)
                visited[i-1]=true;
            if(i<n-1)
                visited[i+1]=true;
        }
        return score;
    }
}