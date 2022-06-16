class Solution {
    public int findGCD(int[] nums) {
        int max=-9999;
        int min=9999;
        int gcd=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        for(int i = 1; i <= max && i <= min; i++)  
        {    
        if(max%i==0 && min%i==0)   
           gcd = i;  
        } 
        return gcd;
    }
}