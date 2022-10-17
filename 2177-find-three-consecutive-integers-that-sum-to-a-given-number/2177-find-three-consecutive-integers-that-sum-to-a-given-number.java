class Solution {
    public long[] sumOfThree(long num) {
        long n = num/3;
        if((n-1) + n + (n+1)==num)
            return new long[]{n-1,n,n+1};
        else
            return new long[0];
    }
}