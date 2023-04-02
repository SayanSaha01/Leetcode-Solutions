class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int ans = Integer.MAX_VALUE;
        int n=0;
        for(int i:nums1)
        {
            for(int j:nums2)
            {
                if(i==j)
                    n=i;
                else
                    n = Math.min(i*10+j,j*10+i);
                ans=Math.min(ans,n);
            }
            
        }
        return ans;
    }
}