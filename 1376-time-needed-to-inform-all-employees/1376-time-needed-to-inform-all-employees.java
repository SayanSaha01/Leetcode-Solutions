class Solution {
    
    ArrayList<ArrayList<Integer>> a = new ArrayList<>();
     public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
		// graph creation
        for(int i=0;i<n;i++){
            a.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<manager.length;i++){
            if(manager[i]>=0)
                a.get(manager[i]).add(i);
        }
        return dfs(headID,informTime); 
    }
    private int dfs(int node,int[] informTime){
        
        int max = 0;
        for(int i:a.get(node)){
            max = Math.max(max,dfs(i,informTime));
        }
        return max+informTime[node];
    }
}