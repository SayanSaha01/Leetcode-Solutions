class Solution {
    public int matrixSum(int[][] nums) {
        for(int[] r:nums){
            Arrays.sort(r);
        }
        int n = nums[0].length-1;
        int sum=0;
        for(int j=0;j<nums[0].length;j++)
        {
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
            for(int i=0;i<nums.length;i++)
            {
                pq.add(nums[i][n]);
            }
            sum+=pq.poll();
            n--;
        }
        return sum;
    }
}