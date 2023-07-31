class Solution {
    public int trap(int[] height) {
        int ans=0;
        for(int i=0;i<height.length;i++)
        {
            int j=i;

            int left=0;
            int right=0;

            while(j>=0)
            {
                left=Math.max(left,height[j]);
                j--;
            }

            j=i;
            while(j<height.length)
            {
                right=Math.max(right,height[j]);
                j++;
            }

            ans=ans+Math.min(left,right)-height[i];

        }
        return ans;
    }
}