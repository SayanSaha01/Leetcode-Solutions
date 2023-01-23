class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        long count=0;
        long up=0;
        long down=0;
        if(k==0)
        {
            if(Arrays.equals(nums1,nums2) == true)
                return 0;
            else
                return -1;
        }
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]!=nums2[i])
            {
                if(Math.abs(nums1[i]-nums2[i])%k!=0)
                    return -1;
                else
                {
                    if(nums1[i]>nums2[i] && Math.abs(nums1[i]-nums2[i])%k==0)
                    {
                        down+=((nums1[i]-nums2[i])/k);
                    }
                    else
                    {
                        up+=((nums2[i]-nums1[i])/k);
                    }
                }
            }
        }
        return (up==down)?up:-1;
    }
}