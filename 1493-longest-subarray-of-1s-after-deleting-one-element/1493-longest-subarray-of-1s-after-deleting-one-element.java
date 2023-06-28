class Solution {
    public int longestSubarray(int[] nums) {
        //initial position of left pointer
        int l = 0;
		//ma length of sequence so far
        int max = 0;
		//count of 0s we met so far
        int count0 = 0;
		
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ++count0;
            }
			//we we met 2 0s - need to move left pointer unless number of 0s is 0 or 1
            while(count0 > 1) {
                if (nums[l] == 0)
                    --count0;
                ++l;
            }
			//update max length of sequence we've found so far
            max = Math.max(max, i - l + 1);
        }
		//max will have length including 0, need to adjust it by 1
        return max - 1;
    }
}