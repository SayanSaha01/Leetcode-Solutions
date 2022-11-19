class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0 ; i<numCourses ; i++){
            adj.add(new ArrayList<>());
        }
        for(int pair[] : prerequisites){
            adj.get(pair[1]).add(pair[0]);
        }
        int indegree[] = new int[numCourses];
        for(int i=0 ; i<numCourses ; i++){
            for(int it : adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0 ; i<numCourses ; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int[] arr = new int[numCourses];
        int count = 0;
        int index=0;
        while(!q.isEmpty()){
            int node = q.poll();
            arr[index++]=node;
            count++;
            for(int it : adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.add(it);
                }
            }
        }
        return count==numCourses?arr:new int[]{};
    }
}