class Solution {
    public int smallestValue(int n) {
        if(n<=4)
        {
            return n;
        }
        return sum_of_prime_factors(n);
    }
    private int sum_of_prime_factors(int n)   //sum of the primefactors of n
    {
        int sum=0;
        for(int i=2;i<=n;i++)
        {
            while(n%i==0)
            {
                sum+=i;
                n=n/i;
            }
        }
        return isprime(sum)? sum : sum_of_prime_factors(sum);
    }
    public boolean isprime(int sum)
    {
        for(int i=2;i<sum/2;i++)
        {
            if(sum%i==0)
                return false;
        }
        return true;
    }
}