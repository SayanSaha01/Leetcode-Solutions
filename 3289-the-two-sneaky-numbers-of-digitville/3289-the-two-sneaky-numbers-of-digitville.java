class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] result = new int[2];
        int j=0;
        for(int n:map.keySet())
        {
            if(map.get(n)==2)
            {
                result[j++]=n;
            }
        }
        return result;
    }
}