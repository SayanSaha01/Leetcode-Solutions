class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=Integer.MIN_VALUE;
        int right=0;
        for(int w:weights)
        {
            left=Math.max(w,left);
            right+=w;
        }
        while(left<right)
        {
            int mid = left + (right-left)/2;
            if(isvalid(weights,mid)<=days)// if we can pack all the weights with the weight capacity(mids) within days
            {
                right=mid;
            }
            else
            {
                left = mid+1;
            }
        }
        return left;    //returning the least weight capacity
    }
    public int isvalid(int[] weights,int target)
    {
        int total=0;
        int count=1; //as 1<=days<=Math.pow(10,5)
        for(int w:weights)
        {
            total+=w;
            if(total>target)  //when the total weights exceed target then we have arrived at the least weight capacity to ship within days 
            {
                count++;
                total=w;
            }
        }
        return count;
    }
}