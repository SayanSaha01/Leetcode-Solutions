class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
            return false;
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        int low = 0;
        int end = row*col-1;
        
        while(low<=end)
        {
            int mid = (low+(end-low)/2);
            int val = matrix[mid/col][mid%col];
            
            if(val==target)
                return true;
            else if(val>target)
                end = mid-1;
            else
                low = mid+1;
        }
        return false;
    }
}