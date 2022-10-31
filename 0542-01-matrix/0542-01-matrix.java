class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==0)
                {
                    queue.offer(new int[]{i,j});
                }
                else
                {
                    mat[i][j]=-1;
                }
            }
        }
        int[][] directions ={{1,0},{-1,0},{0,1},{0,-1}};
        int length = 0;
        while(!queue.isEmpty())
        {
            int size=queue.size();
            length++;
            while(size-->0)
            {
                int[] poll = queue.poll();
                
                for(int[] dir : directions)
                {
                    int row = poll[0]+dir[0];
                    int col = poll[1]+dir[1];
                    
                    if(row < 0 || col<0 || row >= mat.length || col>= mat[0].length || mat[row][col] != -1) {
						continue;
					}
                    mat[row][col]=length;
                    queue.offer(new int[]{row,col});
                }
            }
        }
        return mat;
    }
}