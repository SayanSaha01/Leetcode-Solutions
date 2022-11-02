class Solution {
    
    public boolean dfs (int[][] graph, int[] colour, int node) {
        
        for (int newNode : graph[node]) {
            if (colour[node] == colour[newNode]) {
                return false;
            }
            else if (colour[newNode] == -1) {
                colour[newNode] = 1 - colour[node];
                if (!dfs (graph, colour, newNode)) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public boolean isBipartite(int[][] graph) {
        
        int[] colour = new int[graph.length];
        Arrays.fill (colour, -1);
        
        for (int node = 0; node < graph.length; node++) {
            if (colour[node] == -1) {
                colour[node] = 1;
                if (!dfs (graph, colour, node)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}