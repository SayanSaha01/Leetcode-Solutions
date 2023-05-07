class Solution {
    public int[] colorTheArray(int n, int[][] queries) {
        int[] nums = new int[n];
        Arrays.fill(nums,0);
        int[] ans = new int[queries.length];
        int c=0;
        for(int i=0;i<queries.length;i++)
        {
            int idx = queries[i][0];
            int color = queries[i][1]; 

            int pre = idx>0 ? nums[idx-1]:0;
            int next = idx<n-1 ? nums[idx+1]:0;
            
            if(nums[idx]==pre && nums[idx]!=0)
                c--;
            if(nums[idx]==next && nums[idx]!=0)
                c--;
            
            nums[idx]=color;
            
            if(nums[idx]==pre)
                c++;
            if(nums[idx]==next)
                c++;
            
            ans[i]=c;
        }
        return ans;
    }
}