class Solution {
    public int findCenter(int[][] edges) {
        
        List<List<Integer>> adj = new ArrayList<>();
        int V = edges.length+1;
        for(int i = 0 ; i <= V ; i++)
        {
            adj.add(new ArrayList<Integer>()); 
        }
        
        for(int i = 0 ; i < edges.length ; i++)
        {
           adj.get(edges[i][0]).add(edges[i][1]);
           adj.get(edges[i][1]).add(edges[i][0]);
        }
        
        
        int ans = -1, max = 0;
        for(int i =  1 ; i <= V; i++)
        {
            if(adj.get(i).size() == edges.length)
            {
                ans = i;
            }
        }
        
        return ans;
        
    }
}