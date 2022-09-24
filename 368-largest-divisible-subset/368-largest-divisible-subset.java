class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int n = nums.length;
        int max = 0, end = -1;
        Arrays.sort(nums);
        int[] dp = new int[n];
        int[] hash = new int[n];
        for(int i=0;i<=n-1;i++)
        {
            dp[i]=1;
            hash[i]=-1;
            for(int prev = 0;prev<=i-1;prev++){
                if(nums[i] % nums[prev]==0 && 1+dp[prev]>dp[i])
                {
                    dp[i] = 1 + dp[prev];
                    hash[i]=prev;
                }
            }
            if(dp[i]>max){
                max=dp[i];
                end=i;
            }
        }
        while(end!=-1)
        {
            temp.add(nums[end]);
            end = hash[end];
        }
        return temp;
    }
}