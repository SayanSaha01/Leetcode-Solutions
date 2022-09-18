class Solution {
    public int smallestEvenMultiple(int n) {
        return lcm(n,2);
    }
    public int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
     
    // method to return LCM of two numbers
    public int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
}