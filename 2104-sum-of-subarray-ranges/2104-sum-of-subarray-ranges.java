class Solution {
    public long subArrayRanges(int[] nums) {
        long ans=0;
     
        for(int i=0;i<nums.length;i++)
        {  
            int mi=nums[i],ma=nums[i];
            for(int j=i;j<nums.length;j++)
            {
                mi=Math.min(mi,nums[j]);
                ma=Math.max(ma,nums[j]); 
                ans+=Math.abs(mi-ma);
            }
     
       }
        return ans;
    }
}