class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int max=Integer.MIN_VALUE;
        for(int i=lowLimit;i<=highLimit;i++)  //boxnumbers
        {
            int sum=0;
            int temp = i;
            while(temp!=0)
            {
                sum += temp%10;                    //sum_of_digits
                temp = temp/10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            max = Math.max(map.get(sum),max);
        }
        return max;
    }
}