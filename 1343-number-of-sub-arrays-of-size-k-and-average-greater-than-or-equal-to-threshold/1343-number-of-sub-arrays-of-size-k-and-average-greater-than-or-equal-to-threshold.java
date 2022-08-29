class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int count=0;
        if(sum/k>=threshold)
        {
            count++;
        }
        for(int j=k;j<arr.length;j++)
        {
            sum+=arr[j];
            sum-=arr[j-k];
            if(sum/k>=threshold)
                count++;
        }
        return count;
    }
}