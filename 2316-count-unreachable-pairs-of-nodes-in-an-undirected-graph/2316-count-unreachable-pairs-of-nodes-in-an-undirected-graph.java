class Solution {
    int size = 0;
    public long countPairs(int n, int[][] connections) {        
        List<List<Integer>> adjList = buildGraph(n, connections);        
        List<Integer> sizes = new ArrayList<>(); // to store sizes of each component
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                size = 1; // setting size equal to 1 before starting to visit a component
                dfs(visited, i, adjList);
                sizes.add(size);
            }
        }
        long ans = 0;
        long sum = 0; // total vertices
        for(int i = 0; i<sizes.size(); i++){
            sum=n-sizes.get(i); // reduce the size of the component from sum and then multiply
            ans+=(sizes.get(i)*sum);            
        }        
        return ans/2;
    }
    private void dfs(boolean[] visited, int from, List<List<Integer>> adjList) {
        visited[from] = true;
        for (int to : adjList.get(from)) {
            if (!visited[to]) {
                size++;
                dfs(visited, to, adjList);
            }
        }
    }
    private  List<List<Integer>> buildGraph(int n, int[][] connections) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] connection: connections) {
            adjList.get(connection[0]).add(connection[1]);
            adjList.get(connection[1]).add(connection[0]);
        }
        return adjList;
    }
}