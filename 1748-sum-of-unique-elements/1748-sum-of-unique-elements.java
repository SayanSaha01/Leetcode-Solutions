class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int sum=0;
        for(int i:map.keySet())
        {
            if(map.get(i)==1)
                sum+=i;
        }
        return sum;
    }
}