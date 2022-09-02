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
                int temp=i+map.get(key);
                if(temp>result)
                {
                    result=temp;
                }
                map.put(key,Math.max(i,map.get(key)));
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