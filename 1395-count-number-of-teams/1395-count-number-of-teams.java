class Solution {
    public int numTeams(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            int leftsmall=0,leftlarge=0,rightsmall=0,rightlarge=0;
            for(int j=0;j<i;j++)
            {
                if(arr[i] < arr[j])
                    leftsmall++;
                if(arr[i] > arr[j])
                    leftlarge++;
            }
            for(int k=i+1;k<arr.length;k++)
            {
                if(arr[k] < arr[i])
                    rightsmall++;
                if(arr[k] > arr[i])
                    rightlarge++;
            }
            ans+= leftsmall*rightsmall + leftlarge*rightlarge; 
        }
        return ans;
    }
}