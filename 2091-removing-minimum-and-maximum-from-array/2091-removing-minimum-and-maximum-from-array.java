class Solution {
    public int minimumDeletions(int[] nums) {
        int sum=0;
        int n = nums.length;
        int max=Integer.MIN_VALUE;
        int maxindex = 0;
        int minindex = 0;
        int min=Integer.MAX_VALUE;
        int start  = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                maxindex=i;
            }
            if(nums[i]<min)
            {
                min=nums[i];
                minindex=i;
            }
        }
        /* 3 cases arise
        deleting both min and max from left
        deleting both min and max from right
        deleting min and max from both sides*/
        
        // case 1 - both delete from right
        int rightmost = Math.max(maxindex,minindex); 
        int del_from_left = rightmost+1; //we are taking max in case of deleting elements from left so that in case of [0,-4,19,1,8,-2,-3,5] it deletes both the min and max at once that is in 3 deletions instead of adding the minindex and maxindex from the nearest endpoints separately
        
        //case 2 - both delete from left
        int leftmost = Math.min(maxindex,minindex);
        int del_from_right = n - leftmost;//we are taking min in case of deleting from right so that in one deletion it covers both the min and max
        
        int temp = Math.min(del_from_left,del_from_right);
        
        //case 3 when the max is towards the end and min is towards start
        int del_from_both = (n-rightmost) + leftmost+1;
    
        return Math.min(temp, del_from_both);
    }
}