class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        
        for(int i : nums) 
            sum+=i;
        
        if(sum%2!=0) 
            return false;
        
        sum /= 2;
        
        Boolean[][] mem = new Boolean[n][sum+1];
        return subsetSum(nums,n-1,sum,mem);
    }
    
    Boolean subsetSum(int[] nums, int pos, int sum,Boolean[][] mem){
        if(sum==0) 
            return true;
        
        if(pos==0)
            return nums[0]==sum;
        
        if(mem[pos][sum]!=null) 
            return mem[pos][sum];
        
        Boolean nottake = subsetSum(nums,pos-1,sum,mem);
        Boolean take = false;
        if(sum>=nums[pos])
            take = subsetSum(nums,pos-1,sum-nums[pos],mem);
        
        return mem[pos][sum] = take||nottake;
    }
}