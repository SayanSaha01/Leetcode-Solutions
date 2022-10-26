class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges)
        {
            int src = edge[0];
            int dest = edge[1];
            adj.get(src).add(dest);
            adj.get(dest).add(src);
        }
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);
        return dfs(adj,source,destination,visited);
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> adj,int src,int dest,boolean[] visited)
    {
        if(src==dest)
            return true;
        visited[src]=true;
        for(int i:adj.get(src))
        {
            if(visited[i]==false)
            {
                boolean pathexist = dfs(adj,i,dest,visited);
                if(pathexist)
                    return true;
            }
        }
        return false;
    }
}