class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count=0;
        int less=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                count++;
            else if(nums[i]<target)
                less++;
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<count;i++)
        {
            result.add(less++);
        }
        return result;
    }
}