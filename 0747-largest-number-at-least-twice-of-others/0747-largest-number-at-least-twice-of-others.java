class Solution {
public int dominantIndex(int[] nums) {
    int arr[] = new int[nums.length];
    HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
    for(int i=0;i<nums.length;i++)
    {
        arr[i]=nums[i];
        map.put(nums[i],i);
    }
    Arrays.sort(arr);
    int max=arr[arr.length-1];
    for(int i=0;i<arr.length-1;i++)
    {
        if(max>=2*arr[i])
        {
           continue;
        }
        return -1;
    }
    return map.get(max);
  }
}