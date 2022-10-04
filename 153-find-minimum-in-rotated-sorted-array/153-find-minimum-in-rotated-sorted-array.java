/*class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            //checking which side is sorted
            
            //checking if the left side is sorted
            if(nums[start]<=nums[mid])
            {
                if(nums[start]<min)
                {
                    min=nums[start];
                }
                start=mid+1;
            }
            //checking if the right side is sorted
            else
            {
                if(nums[mid]<min)
                {
                    min = nums[mid];
                }
                end = mid-1;
            }
        }
        return min;
    }
}*/
class Solution {
    public int findMin(int[] arr) {
        int start =0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[end])
            {
                start = mid+1;
            }
            else
            {
                end = mid;
            }
        }
        return arr[start];
    }
}