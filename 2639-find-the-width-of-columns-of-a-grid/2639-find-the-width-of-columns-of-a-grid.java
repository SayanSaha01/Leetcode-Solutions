class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] arr = new int[grid[0].length];
        int k=0;
        for(int i=0;i<grid[0].length;i++)
        {
            int max=0;
            for(int j=0;j<grid.length;j++)
            {
                max=Math.max(max,String.valueOf(grid[j][i]).length());
            }
            arr[i]=max;
        }
        return arr;
    }
}