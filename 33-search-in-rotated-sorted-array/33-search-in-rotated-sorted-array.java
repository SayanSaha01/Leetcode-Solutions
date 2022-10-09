
class Solution {
    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
                return mid;
            // left subpart is sorted and right is not
            else if(arr[start]<=arr[mid])
            {
                if(target>=arr[start] && target<=arr[mid])
                {
                    end = mid-1;
                }
                else
                {
                    start = mid + 1;
                }
            }
            //right subpart is sorted and left is not
            else
            {
                if(target>=arr[mid] && target<=arr[end])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}

/*
class Solution {
    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>=arr[0])   
                start = mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
}*/