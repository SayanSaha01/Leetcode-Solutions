class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr = new int[temperatures.length];
        for(int i=0;i<temperatures.length-1;i++)
        {
            for(int j=i+1;j<=temperatures.length-1;j++)
            {
                if(temperatures[j]>temperatures[i])
                {
                    arr[i]=Math.abs(j-i);
                    break;
                }  
            }
        }
        arr[temperatures.length-1]=0;
        return arr;
    }
}