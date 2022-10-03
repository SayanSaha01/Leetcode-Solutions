class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = lb(nums,target);
        result[1] = ub(nums,target);
        return result;
    }
    public int lb(int arr[],int target)
    {
        int start = 0;
        int end = arr.length-1;
        int idx=-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                idx=mid;
            }
            if(arr[mid]>=target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return idx;
    }
    public int ub(int arr[],int target)
    {
        int start = 0;
        int end = arr.length-1;
        int idx=-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                idx=mid;
            }
            if(arr[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return idx;
    }
}