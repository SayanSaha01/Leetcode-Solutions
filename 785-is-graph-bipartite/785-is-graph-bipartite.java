// 0 --> not coloured
class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            //if my node is not yet colored and my node is not valid
            if(color[i]==0 && !isValidColor(graph,color,1,i))  
            {
                return false;
            } 
        }
        return true;
    }
    public boolean isValidColor(int[][] g, int[] color,int c,int node)
    {
        //if the node is already coloured and if the colour is matching or not
        if(color[node]!=0)
            return color[node]==c;
        //if it is not coloured, colour it with the color passed as parameter
        color[node]=c;
        for(int n:g[node])
        {
            if(!isValidColor(g,color,-c,n))
            {
                return false;
            }
        }
        return true;
    }
}