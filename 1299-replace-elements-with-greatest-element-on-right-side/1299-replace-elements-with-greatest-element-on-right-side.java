class Solution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        int max=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            result[i]=max;
            max = Math.max(arr[i],max);
        }
        return result;
    }
}