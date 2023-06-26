/*class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum==k)
                  count++;
            }
            
        }
        return count;
    }
}*/

class Solution
{
    public int subarraySum(int[] nums, int k)
    {//O(n)
       int count=0,sum=0;
       HashMap<Integer,Integer> map=new HashMap<>();//sum and their corresponding frequency 
       map.put(0,1);//zero sum of 1 frequency 
        
       for(int i=0;i<nums.length;i++)//travesing the array 
       {
           sum+=nums[i];//calulating the running sum or the prefix sum 
           
           if(map.containsKey(sum-k))//we are searching for any sum-k is there or not and what is its frequency
           {
               count+=map.get(sum-k);//whats the frequeny (sum-k) value and adding that to count, as we find the range in which the subarray lies whoes sum will be k  
           }
           
           map.put(sum,map.getOrDefault(sum,0)+1);//calculating the frequeny of every running sum and purting it into the HashMap
       }
       return count;
    
    }
}