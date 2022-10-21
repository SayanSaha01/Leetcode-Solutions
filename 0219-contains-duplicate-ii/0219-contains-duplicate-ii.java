/*
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j] && Math.abs(i-j)<=k)
                    return true;
            }
        }
        return false;
    }
}
*/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k)
                return true;
            else
                map.put(nums[i],i);
        }
        return false;
    }
}