class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] outdegree = new int[n+1];
        int[] indegree = new int[n+1];
        for(int[] tr:trust)
        {
            indegree[tr[1]]++;
            outdegree[tr[0]]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(indegree[i]==n-1 && outdegree[i]==0)
                return i;
        }
        return -1;
    }
}