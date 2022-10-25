class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        boolean[] visited = new boolean[n];
        ArrayList<ArrayList<Integer>> adj = adjacencylistgenerator(n,edges);
        return pathexists(adj,source,destination,visited);
    }
public ArrayList<ArrayList<Integer>> adjacencylistgenerator(int n,int[][] edges)
    {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int[] edge:edges)
        {
            int src = edge[0];
            int dest = edge[1];
            list.get(src).add(dest);
            list.get(dest).add(src);
        }
        return list;
    }
    public boolean pathexists(ArrayList<ArrayList<Integer>> adj,int src,int dest,boolean[] visited)
    {
        if(src==dest)
            return true;
        visited[src]=true;
        for(int i:adj.get(src))
        {
            if(visited[i]==false)
            {
                boolean haspath = pathexists(adj,i,dest,visited);
                if(haspath)
                    return true;
            }
        }
        return false;
    }
}