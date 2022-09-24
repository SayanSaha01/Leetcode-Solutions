/*import java.util.*;
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int[] hash = new int[n];
        Arrays.fill(hash,1);
        int max=0;
        int lastindex=0;
        for(int idx=0;idx<=n-1;idx++)
        {
            for(int prev=0;prev<=idx-1;prev++)
            {
                if(nums[idx]%nums[prev]==0 && 1+dp[prev]<dp[idx])
                {
                    dp[idx] = 1+dp[prev];
                    hash[idx]=prev;
                }
            }
            if(nums[idx]>max)
            {
                max = nums[idx];
                lastindex = idx;
            }
        }
        List<Integer> res = new ArrayList<>();
        while (lastindex!=-1) {
            res.add(nums[lastindex]);
            lastindex = hash[lastindex];
        }
        return res;
    }
}*/
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int dp[] =   new int[nums.length];
        int prev[] =  new int[nums.length];
        Arrays.sort(nums);
        int maxlen = 0,end = 0, n =  nums.length;
        for(int i=0;i<n;i++){
            int count  =  1;
            int previdx = -1;
            for(int j=i-1;j>=0;j--){
                if(nums[i]%nums[j]==0 && dp[j]+1>count ){
                    count =  dp[j]+1;
                    previdx = j;                    
                }
            }
            dp[i] = count;
            prev[i] = previdx;
            
            if(dp[i]>maxlen){
                maxlen =  dp[i];
                end =  i;
            }                        
        }
        ArrayList<Integer> ans =  new ArrayList<Integer>();
        while(end!=-1){
            ans.add(nums[end]);
            end =  prev[end];
        }
        
        return ans;
        
    }
}
