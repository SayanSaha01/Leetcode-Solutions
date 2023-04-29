class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n))
        {
            set.add(n);
            n = squaredsum(n);
        }
        return n==1;
    }
    public int squaredsum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int unit = n%10;
            sum+=unit*unit;
            n=n/10;
        }
        return sum;
    }
}