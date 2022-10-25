class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        for(int i = 0;i<nums.length;i++) {
            for(int j = i+1;j<=i+indexDiff && j<nums.length;j++){
                if(Math.abs(nums[i] - nums[j]) <=valueDiff) 
                    return true;
            }
        } 
        return false;
    }
}
/* public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {        
        int leftIndex = 0;
        int rightIndex = 1;
        
        while(rightIndex < nums.length){
            int tempValueDiff = Math.abs(nums[leftIndex] - nums[rightIndex]);
            int tempIndexDiff = Math.abs(leftIndex - rightIndex);
            
            if(tempValueDiff <= valueDiff && tempIndexDiff <= indexDiff){
               return true;
            }            
            else if(tempIndexDiff == indexDiff || rightIndex == nums.length - 1){
                rightIndex = ++leftIndex;
            }
            rightIndex++;
        }
        
        return false;
    }
}*/