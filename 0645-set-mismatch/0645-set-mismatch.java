class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        HashSet<Integer> set = new HashSet<Integer>();
        int totalsum=0;
        for(int i=1;i<=nums.length;i++)
        {
            totalsum+=i;
        }
        int uniquesum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                arr[0]=nums[i];
            }
            else
            {
                set.add(nums[i]);
                uniquesum+=nums[i];
            }
        }
        arr[1] = totalsum-uniquesum;
        return arr;
    }
}