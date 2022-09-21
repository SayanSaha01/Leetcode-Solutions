class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] result = new int[nums.length];
        int evesum=0;
        for(int num:nums)
        {
            if(num%2==0)
                evesum+=num;
        }
        for(int i=0;i<queries.length;i++)
        {
            if(nums[queries[i][1]]%2==0)
                evesum-=nums[queries[i][1]];
            
            nums[queries[i][1]] = nums[queries[i][1]]+queries[i][0];
            
            if(nums[queries[i][1]]%2==0)
                evesum+=nums[queries[i][1]];
            
            result[i]=evesum;
        }
        
        return result;
    }
}