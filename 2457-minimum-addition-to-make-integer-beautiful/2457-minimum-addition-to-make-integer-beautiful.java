class Solution {
    public long makeIntegerBeautiful(long n, int target) {
       long x=n,mul=1;
       while(sum(x)>target)
       {
           x=x/10+1;
           mul*=10;
       }
       return x*mul-n;
    }
    public long sum(long x)
    {
        long s=0;
        while(x!=0)
        {
            s+=x%10;
            x/=10;
        }
        return s;
    }
}