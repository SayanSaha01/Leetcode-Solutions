/*
class Solution {
    public int numTrees(int n) {
        if(n==1 || n==0) //if n=1 then only a single node is present as BST,if n=0 then an empty BST is possible hence in both cases we return 1
            return 1;
        int sum=0; //to keep track of possible unique BST
        for(int i=1;i<=n;i++)  //making all the unique values as root node and trying out all possible combinations
        {
            sum+=numTrees(i-1)*numTrees(n-i);
        }
        return sum;
    }
}
*/
class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
    public int solve(int n,int[] dp)
    {
        if(n<=1)
            return 1;
        if(dp[n]!=-1)
            return dp[n];
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=solve(i-1,dp)*solve(n-i,dp);
        }
        return dp[n]=sum;
    }
}