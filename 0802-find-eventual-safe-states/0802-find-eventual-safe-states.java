class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
        int V = graph.length;
        int[] indegree = new int[V];
        
        for(int i=0; i<V; i++)
            adj.add(new ArrayList<>());
        
        // Reverse the directed edges of the graph
        // Because we want here the outdegree int this question
        
        for(int i=0; i<graph.length; i++){
            for(int it: graph[i]){
                adj.get(it).add(i);
                indegree[i]++;
            }
        }
        
        // After reversing the graph we will simply return the topological sort for all the indegrees zero
        // If any node doesn't reaches indegree zero 
        // that means it has another indegree as well and it can't be safe node
        return topo(adj,indegree);
    }
    
    public List<Integer> topo(List<List<Integer>> adj, int[] indegree){
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i<adj.size(); i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        
        List<Integer> res = new ArrayList<>();
        while(!queue.isEmpty()){
            int node = queue.poll();
            res.add(node);
            
            for(Integer adjacent: adj.get(node)){
                indegree[adjacent]--;
                if(indegree[adjacent]==0){
                    queue.offer(adjacent);
                }
            }
        }
        
        Collections.sort(res);
        return res;
    }
}