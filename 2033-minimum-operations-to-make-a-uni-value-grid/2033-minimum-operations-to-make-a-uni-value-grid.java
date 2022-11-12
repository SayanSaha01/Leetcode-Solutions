class Solution {
    public int minOperations(int[][] grid, int x) {
        int n = grid.length;
        int m = grid[0].length;
        int index=0;
        int[] arr = new int[n*m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[index++]=grid[i][j];
            }
        }
        int count=0;
        Arrays.sort(arr);
        int median = arr[(arr.length-1)/2];
        for(int i:arr)
        {
            
            if(i==median)
                continue;
            if(Math.abs(i-median)%x!=0)
                return -1;
            count+=Math.abs(i-median)/x;
        }
        return count;
    }
}