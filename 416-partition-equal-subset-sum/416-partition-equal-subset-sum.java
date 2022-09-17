class Solution {

    public boolean canPartition(int[] nums) {

        int target = 0;
        int sum = 0;
        for (int i : nums)    
            sum += i;
        
        if (sum % 2 != 0)  
            return false;
        
        target = sum / 2;
        int[][] temp = new int[nums.length][target + 1];
        for(int[] row:temp)
            Arrays.fill(row,-1);
        boolean ans = get(nums, nums.length - 1, target, temp);
        
        return ans;
    }

    boolean get(int[] nums, int index, int target, int[][] temp) {
        if (index == 0)    
            return (target == nums[0]);
        
        if (temp[index][target] != -1) 
        {
            return temp[index][target]==1?true:false;
        }

        boolean x = get(nums, index - 1, target, temp);
        boolean y = false;
        if (target >= nums[index])
            y = get(nums, index - 1, target - nums[index], temp);

        temp[index][target]=x||y?1:0;
        
        return x || y;
    }
}
