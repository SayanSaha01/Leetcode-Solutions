class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(list.contains(nums[i]))
            {
                continue;
            }
            else
            {
                list.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        int index=0;
        for(int i=0;i<list.size();i++)
        {
            count=Math.min(2,map.get(list.get(i)));
            for(int j=0;j<count;j++)
            {
                nums[index++]=list.get(i);
            }
        }
        return index;
    }
}