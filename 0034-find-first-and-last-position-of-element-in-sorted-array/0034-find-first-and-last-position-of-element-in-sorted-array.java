class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = findfirst(nums,target);
        arr[1] = findlast(nums,target);
        return arr;
    }
    public int findfirst(int[] arr,int target)
    {
        int start=0;
        int idx=-1;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                idx=mid;
                end=mid-1;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return idx;
    }
    public int findlast(int[] arr,int target)
    {
        int start=0;
        int idx=-1;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                idx=mid;
                start=mid+1;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return idx;
    }
}