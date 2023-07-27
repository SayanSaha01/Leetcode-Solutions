class Solution {
    public int uniquePathsIII(int[][] grid) {
        int sx = 0; // start x
        int sy = 0;
        int zero = 0; // zero count
        for(int r = 0;r<grid.length;r++){
            for(int c = 0 ;c<grid[0].length;c++){
                if(grid[r][c] == 1){ // find the start point
                    sx = r;
                    sy = c;
                }else if(grid[r][c] == 0){
                    zero++;
                }
            }
        }
        
        
        return dfs(grid,sx,sy,zero);
    }
    
    private int dfs(int[][] grid, int x, int y, int zero){
        if( x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == -1){
            return 0;
        }
        
        if(grid[x][y] == 2){
            return zero == -1 ? 1 : 0;
        }
        grid[x][y] = -1;
        zero--;
        
        int totalPaths = dfs(grid,x+1,y,zero) +
            dfs(grid,x,y+1,zero) +
            dfs(grid,x-1,y,zero) +
            dfs(grid,x,y-1,zero);
        
        grid[x][y]=0;
        zero++;
        
        return totalPaths;
    }
}