/*class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        if(nums==null || nums.length<1)
            return -1;
        if(nums.length==1)
            return 0; // if single element present then that's the answer
		
		//we are handling the first element and last element separately as it is given nums[-1] = nums[n] = -∞ 
        if(nums[0]>nums[1])
            return 0;
        if(nums[nums.length-1]>nums[nums.length-2])
            return nums.length-1;
        
        int start = 1;
        int end = nums.length-2;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            
            if(nums[mid] > nums[mid-1] && nums[mid] >nums[mid+1])
                return mid;
            else if(nums[mid+1]>nums[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}*/
//MEthod 2 Love Babbar approach
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]<arr[mid+1])
            {
                start = mid+1;
            }
            else  //this indicates that the peak element may lie on the second line or else it might be the peak element itself
            {
                end = mid;      //question is in all the questions we do mid-1, why not in this case. Answer-> if we do mid-1 it will go back to the first line but if we are in the else loop we are traversing through the 2nd line and it has to be on the second line
            }
        }
        return start;
    }
}