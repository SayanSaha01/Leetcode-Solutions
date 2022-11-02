class Solution {
    
    public boolean dfs (int[][] graph, int[] coloured, int i,int color) {
        
        coloured[i]=color;
        for (int it : graph[i])
        {
            if(coloured[it] == -1) 
            {
                if(dfs(graph,coloured,it,1-color)==false) 
                {
                    return false;
                }
            }
            else if(coloured[it]==color)
                return false;
        }
        return true;
    }
    
    public boolean isBipartite(int[][] graph) {
        
        int[] coloured = new int[graph.length];
        Arrays.fill (coloured, -1);
        
        for (int i = 0; i < graph.length; i++) {
            if (coloured[i] == -1) 
            {
                if (dfs(graph,coloured,i,0)==false)
                {
                    return false;
                }
            }
        }
        
        return true;
    }
}