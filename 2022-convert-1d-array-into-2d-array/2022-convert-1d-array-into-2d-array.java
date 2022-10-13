class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        //Base case
        if(original.length!=m*n)
            return new int[][]{};
        int index=0;
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=original[index++];
            }
        }
        return arr;
    }
}