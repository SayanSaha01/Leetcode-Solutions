class Solution {
    public int tribonacci(int n) {
        int a=0,b=1,c=1;
        if(n<=1)
            return n;
        if(n==2)
            return 1;
        while(n-->2)
        {
            int d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        return c;
    }
}