class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0]=firstocc(nums,target);
        result[1] = lastocc(nums,target);
        return result;
    }
    private int firstocc(int[] nums,int x)
    {
        int low=0;
        int high=nums.length-1;
        int idx;
        int n=nums.length;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]>x)
            {
                high = mid-1;
            }
            else if (nums[mid]<x)
            {
                low=mid+1;
            }
            else
            {
                if(mid==0||nums[mid]!=nums[mid-1])
                    return mid;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
    private int lastocc(int[] nums,int x)
    {
        int low=0;
        int high=nums.length-1;
        int n=nums.length;
        int idx;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]>x)
            {
                high = mid-1;
            }
            else if (nums[mid]<x)
            {
                low=mid+1;
            }
            else
            {
                if(mid==n-1||nums[mid]!=nums[mid+1])
                    return mid;
                else
                    low=mid+1;
            }
        }
        return -1;
    }
}