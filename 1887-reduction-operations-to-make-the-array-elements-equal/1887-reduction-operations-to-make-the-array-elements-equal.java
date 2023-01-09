class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=nums.length-1;i>=1;i--)
        {
            //for finding the next greater element
            if(nums[i]!=nums[i-1])
            {
            /*When we got next greater we'r converting all existing elements till i
            1,2,2,3,3,3
            while i - 1 = 2 we find 2 which is not equals 3 so we'r going to convert all elements till i=3 in reverse order
            we need 3 operations to make this change which equals nums.length - i
            then we'll have array like this = 1,2,2,2,2,2
            after when nums[i - 1] = 1 our 'i' will be 1 and we'r going to convert  
            all elements till i = 1 in reverse order
            so for that change we'll need 5 operations which equals nums.length (6)             - i (1).
            in total we'll have 8 operations
            */
                count+=nums.length-i;
            }
        }
        return count;
    }
}