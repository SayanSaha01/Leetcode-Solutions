//the end pointer iterates over the length of the array, and the start pointer starts at the beginning of the array. Whenever I am still on a 1, I update max, and once I hit a 0, I move the start of the window to the element after the current end. This is because we know that the current end is 0, so we move the start to the next element that could be a 1, which is the one after the current end.

//dry run to understand
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int start=0;
        for(int end=0;end<nums.length;end++)
        {
            if(nums[end]==1)
            {
                max = Math.max(max,end-start+1);
            }
            else
            {
                start = end + 1;
            }
        }
        return max;
    }
}