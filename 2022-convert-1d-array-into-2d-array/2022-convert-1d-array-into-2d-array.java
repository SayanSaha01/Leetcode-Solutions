class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int N = original.length;
        if(N!=m*n)
            return new int[][]{};
        int[][] arr = new int[m][n];
        int index=0;
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