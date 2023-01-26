class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=2*i+start;
        }
        int xor=0;
        for(int i=0;i<n;i++)
        {
            xor^=arr[i];
        }
        return xor;
    }
}