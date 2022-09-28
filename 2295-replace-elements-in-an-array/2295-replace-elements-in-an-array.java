/*Throws TLE
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        for(int i=0;i<operations.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==operations[i][0])
                {
                    nums[j]=operations[i][1];
                }
            }
        }
        return nums;
    }
}
*/
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<operations.length;i++)
        {
            nums[map.get(operations[i][0])] = operations[i][1];
            map.put(operations[i][1],map.get(operations[i][0]));
        }
        return nums;
    }
}