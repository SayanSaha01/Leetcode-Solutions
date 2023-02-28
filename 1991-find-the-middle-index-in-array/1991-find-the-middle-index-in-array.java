class Solution {
    public int findMiddleIndex(int[] a) {
        int sum = 0;
        
        for(int i : a) sum += i;

        int leftSum = 0;
        int rightSum = sum;

        for(int i = 0; i < a.length; i++){
            rightSum -= a[i];

            if(rightSum == leftSum) return i;

            leftSum += a[i];
        }
        return -1;
    }
}