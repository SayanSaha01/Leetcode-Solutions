class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
        int V = graph.length;
        
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
        
        int[] indegree = new int[V];
        
        //normally it happens that we assign in list.get(i).add(it) but as we need to reverse the directions we do list.get(it).add(it)
        for(int i=0;i<graph.length;i++)
        {
            for(int it:graph[i])
            {
                adj.get(it).add(i);
                indegree[i]++;
            }
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<indegree.length;i++)
        {
            if(indegree[i]==0)
                queue.add(i);
        }
        
        int index=0;
        List<Integer> res = new ArrayList<>();
        while(!queue.isEmpty())
        {
            int node = queue.poll();
            res.add(node);
            for(int it:adj.get(node))
            {
                indegree[it]--;
                
                if(indegree[it]==0)
                {
                    queue.add(it);
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}