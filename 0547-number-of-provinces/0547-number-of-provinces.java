class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int n = isConnected.length;
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<>());  //initialising the number of arraylists in the arraylist of arraylists;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)   //as it is given nxn matrix
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
        for(int i:list.get(src))
        {
            if(visited[i]==false)
            {
                visited[i]=true;
                dfs(list,visited,i);
            }
        }
    }
}