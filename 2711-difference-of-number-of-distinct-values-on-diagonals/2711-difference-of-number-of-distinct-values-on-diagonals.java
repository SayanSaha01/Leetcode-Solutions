class Solution {
    public int[][] differenceOfDistinctValues(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] mat = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                Set<Integer> topleft = new HashSet<Integer>();
                
                for(int r=i-1,c=j-1; c>=0 && r>=0; r--,c--)
                    topleft.add(grid[r][c]);
                
                Set<Integer> bottomright = new HashSet<Integer>();
                
                for(int r=i+1,c=j+1; r<m&&c<n; r++,c++)
                    bottomright.add(grid[r][c]);
                
                mat[i][j]=Math.abs(topleft.size()-bottomright.size());
            }
        }
        return mat;
    }
}