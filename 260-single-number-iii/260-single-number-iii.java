class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        ArrayList<Integer> arrayList= new ArrayList<>();
        for(int i:map.keySet())
        {
            if(map.get(i)==1)
            {
                arrayList.add(i);
            }
        }
        int[] array = new int[2];
        for (int i = 0; i < array.length; i++) {
             array[i] = arrayList.get(i);
            }
        return array;
    }
}