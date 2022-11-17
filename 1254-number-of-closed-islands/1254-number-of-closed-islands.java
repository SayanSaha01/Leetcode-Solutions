//https://leetcode.com/problems/number-of-closed-islands/discuss/425150/JavaC%2B%2B-with-picture-Number-of-Enclaves

class Solution {  
    public int closedIsland(int[][] g) {
	//count the number
        int count = 0; 
        for(int i = 0;i < g.length;i++){
           for(int j = 0;j < g[0].length;j++){
                if(g[i][j] == 0){
                       count += dfs(g,i,j);
                }
           }
        }
        return count;
    }
    private int dfs(int[][] g,int row,int col){
         if(row < 0 || row >= g.length || col < 0 || col >= g[0].length){
                 return 0;//if we meet the edge return 0;
         }
         if(g[row][col] == 1){
                 return 1;//if we meet 1 return 1;
         }
         g[row][col] = 1;
         int up = dfs(g,row-1,col);
         int down = dfs(g,row+1,col);
         int left = dfs(g,row,col-1);
         int right = dfs(g,row,col+1);
         return up & down & left & right;//any of the side meet the edge,is not a island;
    }
}