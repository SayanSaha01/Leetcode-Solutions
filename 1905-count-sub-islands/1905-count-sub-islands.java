class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        
        int m = grid2.length;
        int n = grid2[0].length;
        
        int countsub = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid2[i][j] == 1) {
                    if (dfs(grid1, grid2, i, j) == true) {
                        countsub++;
                    }
                }
            }
        }
        return countsub;
    }
    
    private boolean dfs(int[][] grid1, int[][] grid2, int i, int j) {
        if (i < 0 || j < 0 || i >= grid2.length || j >= grid2[i].length 
            || grid2[i][j] != 1) {
            return true;
        }
        if (grid1[i][j] != grid2[i][j]) {
            return false;
        }
        grid2[i][j] = -1;
        
        boolean left = dfs(grid1, grid2, i - 1, j);
        boolean right = dfs(grid1, grid2, i + 1, j);
        boolean up = dfs(grid1, grid2, i, j + 1);
        boolean down = dfs(grid1, grid2, i, j - 1);
            
        return left && right && up && down;

    }
}
