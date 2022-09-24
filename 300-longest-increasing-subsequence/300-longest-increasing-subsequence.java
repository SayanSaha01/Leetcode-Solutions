/*
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
//prev_idx in recursion ranged from -1,0,1,2.......n-1; but in dp[-1] is not possible so we shft index and replace by n+1
        int[][] dp  = new int[n][n+1];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return recursion(0,-1,n,nums,dp);
    }
    public int recursion(int idx,int prev_idx,int n,int[] nums,int[][] dp)
    {
        int max=0;
        if(idx==n)
            return 0;
        if(dp[idx][prev_idx+1]!=-1)
            return dp[idx][prev_idx+1];
        int nottake = 0 + recursion(idx+1,prev_idx,n,nums,dp);
        int take = 0;
        if(prev_idx==-1 || nums[idx]>nums[prev_idx])
        {
            take = 1 + recursion(idx+1,idx,n,nums,dp);
        }
        return dp[idx][prev_idx+1] = Math.max(take,nottake);
    }
}
*/

class Solution {
    public int lengthOfLIS(int[] arr){
        int n = arr.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int ans=-1;
        for(int i=0; i<=n-1; i++)
        {
            for(int prev_index = 0; prev_index <=i-1; prev_index ++)
            {
                if(arr[prev_index]<arr[i])
                {
                    dp[i] = Math.max(dp[i], 1 + dp[prev_index]);
                }
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
/*
for printing the LIS
import java.util.*;
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp=new int[n];
    Arrays.fill(dp,1);
    int[] hash=new int[n];
    Arrays.fill(hash,1);  
    for(int i=0; i<=n-1; i++){
        hash[i] = i; // initializing with current index
        for(int prev_index = 0; prev_index <=i-1; prev_index ++){           
            if(arr[prev_index]<arr[i] && 1 + dp[prev_index] > dp[i]){
                dp[i] = 1 + dp[prev_index];
                hash[i] = prev_index;
            }
        }
    }    
    int ans = -1;
    int lastIndex =-1;    
    for(int i=0; i<=n-1; i++){
        if(dp[i]> ans){
            ans = dp[i];
            lastIndex = i;
        }
    } 
    ArrayList<Integer> temp=new ArrayList<>();
    temp.add(arr[lastIndex]);
    while(hash[lastIndex] != lastIndex){ // till not reach the initialization value
        lastIndex = hash[lastIndex];
        temp.add(arr[lastIndex]);    
    }
    Collections.reverse(temp);
  }
}*/