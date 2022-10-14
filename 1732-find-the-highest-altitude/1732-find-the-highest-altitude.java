class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length+1];
        arr[0]=0;
        int sum=0;
        for(int i=0;i<gain.length;i++)
        {
            arr[i+1]=sum+gain[i];
            sum=arr[i+1];
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}