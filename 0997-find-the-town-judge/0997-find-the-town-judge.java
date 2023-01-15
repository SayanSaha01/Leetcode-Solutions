class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] outdegree = new int[n+1];
        int[] indegree = new int[n+1];   //why n+1 coz we have nodes from 1 to  n and by default array indexes are marked from 0 to n-1 hence for nth index array we create n+1
        for(int[] tr:trust)
        {
            indegree[tr[0]]++;
            outdegree[tr[1]]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(indegree[i]==0 && outdegree[i]==n-1)
                return i;
        }
        return -1;
    }
}