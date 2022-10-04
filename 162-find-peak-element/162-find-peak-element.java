// Consider an example  7 8 9 6 5 4 3 -->9 is the peak element
//  we get the nums[mid]==6 using binary search
// now we return this number if it is a peak otherwise we have to make a a decision as to which side to binary search(left side of mid or right side of mid)
// we check number nums[mid-1]
// if(nums[mid-1] > nums[mid]) it would make more sense to search in left side of mid
// because for nums[mid-1] to not be a peak there has to be a number greater than it to it's left
// this goes on until we encounter the largest element
// (worst case the largest element is the first element)
//therefore we are sure to get atleast one peak element to the left of mid in case nums[mid-1] > num[mid]
    
    //Time Complexity: O(log(n))
	//Space Complexity: O(1)
    class Solution {
    public int findPeakElement(int[] nums) {
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
}