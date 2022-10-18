class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int startrow = 0;
        int leftcol = 0;
        int bottomrow = n-1;
        int rightcol = n-1;
        int count=1;
        while(count<=n*n)
        {
            for(int i=leftcol;i<=rightcol && count<=n*n;i++)
            {
                matrix[startrow][i]=count++;
            }
            startrow++;
            
            // right column
            for(int i=startrow;i<=bottomrow && count<=n*n;i++)
            {
                matrix[i][rightcol]=count++;
            }
            rightcol--;
            
            // bottom row
            for(int i=rightcol;i>=leftcol && count<=n*n; i--)
            {
                matrix[bottomrow][i]=count++;
            }
            bottomrow--;
            
            // left col
            for(int i=bottomrow;i>=startrow && count<=n*n;i--)
            {
                matrix[i][leftcol]=count++;
            }
            leftcol++;
        }
        return matrix;
    }
}