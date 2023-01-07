class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Queue<int[]> queue = new LinkedList<int[]>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0) //we need to find out,distance of nearest 0 but lets find out the distance from the cells marked 0
                {
                    queue.add(new int[]{i,j});
                }
                else
                {
                    mat[i][j]=-1;
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
                    if(row>=0 && col>=0 && row<mat.length && col<mat[0].length && mat[row][col]==-1)
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