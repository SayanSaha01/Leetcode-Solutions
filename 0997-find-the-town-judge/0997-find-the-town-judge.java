class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] outdegree = new int[n+1];
        int[] indegree = new int[n+1];   //why n+1 coz we have nodes from 1 to  n and by default array indexes are marked from 0 to n-1 hence for nth index array we create n+1
        for(int[] tr:trust)
        {
            outdegree[tr[0]]++;    // since town judge trusts nobody, number of outgoing edgres from him will be 0
            indegree[tr[1]]++;     //since everybody trusts town judge except for he himself the number of indegree for the townjudge will be n-1 excluding him out of n people
        }
        for(int i=1;i<=n;i++)
        {
            if(outdegree[i]==0 && indegree[i]==n-1)
                return i;
        }
        return -1;
    }
}