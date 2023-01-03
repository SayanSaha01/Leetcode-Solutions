class Solution {
    public int makeConnected(int n, int[][] connections) {
        int conn = connections.length;
        if(conn < n-1)       //the min no of edges for n vertices is n-1, so if the no of connections are less than conn then not possible
            return -1;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        //converting into adjacency list
        for(int i=0;i<n;i++)
        {
            adj.add(i,new ArrayList<Integer>());
        }
        int rows = connections.length;
        for(int i=0;i<rows;i++)
        {
            int u = connections[i][0];
            int v = connections[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int count=0;
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                count++;
                dfs(adj,visited,i);
            }
        }
        return count-1;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int src)
    {
        visited[src]=true;
        for(int it:adj.get(src))
        {
            if(!visited[it])
               dfs(adj,visited,it);
        }
    }
}