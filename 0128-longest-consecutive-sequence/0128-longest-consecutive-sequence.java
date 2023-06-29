class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        
        for(int i=0;i<nums.length;i++)
        {
            int num = nums[i];
            int count = 1;
            while(set.contains(--num))
            {
                count++;
                set.remove(num);
            }
            
            num=nums[i];
            while(set.contains(++num))
            {
                count++;
                set.remove(num);
            }
            max = Math.max(max,count);
        }
        return max;
    }
}