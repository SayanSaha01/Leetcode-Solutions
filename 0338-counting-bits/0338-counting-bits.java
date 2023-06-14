class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            arr[i]=countones(i);
        }
        return arr;
    }
    public int countones(int num)
    {
        int n1=0;
        while(num!=0)
        {
            if((num&1)==1)
                n1++;
            num=num>>1;
        }
        return n1;
    }
}