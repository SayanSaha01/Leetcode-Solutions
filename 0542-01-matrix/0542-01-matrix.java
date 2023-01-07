class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Queue<int[]> queue = new LinkedList<int[]>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0) //we need to find out,distance of nearest 0 from each cell but lets do the reverse and find out the min distance from the cells marked 0
                {
                    queue.add(new int[]{i,j});
                }
                else
                {
                    mat[i][j]=-1;     // we are marking every 1 with -1 to get any idea which cells to visit during bfs
                }
            }
        }
        int nearest=0;
        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!queue.isEmpty())
        {
            nearest++;
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                int[] node = queue.poll();
                for(int[] d:dir)
                {
                    int row = d[0]+node[0];
                    int col = d[1]+node[1];
                    if(row>=0 && col>=0 && row<mat.length && col<mat[0].length && mat[row][col]==-1)     //we will visit only those nearby cells having -1 that we earlier marked to find nearest distance from cells marked 0, once we allocate them nearest value we cant revisit them again as it doesnt satisfy the condition as mat[row][col] will have values like 1,2,3 and we specifically visit those rows not visited and having mat[row][col]=-1. why does this method work, we move from cells with 0 and consecutively updating the neighbours with the least val we push it into the queue to find the next least values for the neighbouring cells having val -1
                    {
                        mat[row][col]=nearest;
                        queue.add(new int[]{row,col});
                    }
                }
            }
        }
        return mat;
    }
}