class Solution {
    public int findCircleNum(int[][] isConnected) {
    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int n = isConnected.length;
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j && isConnected[i][j]==1)
                {
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
            }
        }
        
        int count=0;
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);
        for(int i=0;i<n;i++)
        {
            if(visited[i]==false)
            {
                count++;
                dfs(list,visited,i);
            }
        }
        return count;
    }
    public void dfs(ArrayList<ArrayList<Integer>> list,boolean[] visited,int src)
    {
        visited[src]=true;
        for(int it:list.get(src))
        {
            if(visited[it]==false)
            {
                visited[it]=true;
                dfs(list,visited,it);
            }
        }
    }
}