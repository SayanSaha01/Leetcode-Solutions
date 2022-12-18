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
            while(n%i==0)    //suppose number is 8 so because we are using while loop 2 will keep on dividing 8 unless and untill we reach a number which is nt divisible by 2 then only we will break out of the while loop.
            {
                sum+=i;
                n=n/i;
            }
        }
        return isprime(sum)? sum : sum_of_prime_factors(sum);
        //if the sum of prime factors obtained is prime then no more prime factors of it is possible  other than 1 and the number itself, then in such cases we return the sum of the prime factors of the original number 
        
// and if the sum of the prime factors of the numbers isnt prime then we pass the sum recursively  
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