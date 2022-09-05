class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       
        //If array has no elements
        if(arr.length == 0){
            return -1;
        }
        
        int start = 0;
        int end = arr.length -1;
        int target = 0;
        
        while(start <= end){
        
            int mid = (end+start)/2;
            //Comparing (mid) with (mid+1) 
            if(arr[mid] > arr[mid + 1])
            {
                if(arr[mid] > arr[mid - 1]) 
                    return mid;
                else 
                    end = mid - 1;
            }
            else if (arr[mid] < arr[mid + 1]) 
                start = mid + 1;
        }
        return 0;
    }
}