class Pair{
    int row;
    int col;
    int time;
    
    Pair(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}

class Solution {
    int dir[][] = {{-1,0},{1,0},{0,1},{0,-1}};

    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count=0,max=0;
        
        Queue<Pair> queue = new LinkedList<>();
        boolean[][] visited = new boolean[row][col];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    queue.add(new Pair(i,j,0));
                }
            }
        }
        
        while(!queue.isEmpty()){
            Pair p = queue.remove();
            visited[p.row][p.col]=true;
            
            for(int dr[] : dir){
                int i = p.row+dr[0];
                int j = p.col+dr[1];
                
                if(isValidDir(i,j,grid) && grid[i][j]==1 && !visited[i][j]){
                    grid[i][j]=2;
                    queue.add(new Pair(i,j,p.time+1));
                }
            }
            max=Math.max(max,p.time);
        }
        
        for(int rows[] : grid){
            for(int cols : rows){
                if(cols==1) count++;
            }
        }
        
        return count>0 ? -1 : max;
    }
    
    private boolean isValidDir(int i,int j,int grid[][]){
        if(i<0 || i>=grid.length||
           j<0 || j>=grid[0].length){
            return false;
        }
        
        return true;
    }
}