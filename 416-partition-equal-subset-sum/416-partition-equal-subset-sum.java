class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        
        for(int i : nums) 
            sum+=i;
        
        if(sum%2!=0) 
            return false;
        
        sum /= 2;
        
        Boolean[][] mem = new Boolean[n+1][sum+1];
        return subsetSum(nums,0,sum,mem);
    }
    
    Boolean subsetSum(int[] nums, int pos, int sum,Boolean[][] mem){
        if(sum==0) 
            return true;
        
        else if(pos>=nums.length || sum<0) return false;
        
        if(mem[pos][sum]!=null) 
            return mem[pos][sum];
        
        Boolean take= subsetSum(nums,pos+1,sum-nums[pos],mem);
        Boolean nottake = subsetSum(nums,pos+1,sum,mem);
        
        return mem[pos][sum] = take||nottake;
    }
}