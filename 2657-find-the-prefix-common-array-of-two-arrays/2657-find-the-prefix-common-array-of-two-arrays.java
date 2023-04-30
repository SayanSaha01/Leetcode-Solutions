class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] prefix_arr = new int[A.length];
        int[] commoncount = new int[51];     //since 1<=n<=50
        for(int i=0;i<A.length;i++)
        {
            commoncount[A[i]]++;
            commoncount[B[i]]++;
            int count=0;
            for(int j=1;j<=50;j++)
            {
                if(commoncount[j]==2)
                {
                    count++;
                }
            }
            prefix_arr[i]=count;
        }
        return prefix_arr;
    }
}