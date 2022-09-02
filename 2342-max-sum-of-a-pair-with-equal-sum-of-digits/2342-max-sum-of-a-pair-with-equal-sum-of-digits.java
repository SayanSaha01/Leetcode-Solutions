class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int result=-1;
        for(int i:nums)
        {
            int key = sum(i);
            
            if(!map.containsKey(key))
            {
                map.put(key,i);
            }
            else
            {
                result = Math.max(result, map.get(key) + i);
                map.put(key, Math.max(map.get(key), i));
            }
        }
        
        return result;
    }
    public static int sum(int num)
    {
        int sum=0;
        while(num>0)
        {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}