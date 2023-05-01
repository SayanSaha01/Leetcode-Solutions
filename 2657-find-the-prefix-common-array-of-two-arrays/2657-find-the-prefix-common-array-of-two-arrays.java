class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res = new int[A.length];
        int[] elements = new int[51];
        for(int i=0;i<A.length;i++)
        {
            elements[A[i]]++;
            elements[B[i]]++;
            int count=0;
            for(int j=1;j<=50;j++)
            {
                if(elements[j]==2)
                {
                    count++;
                }
            }
            res[i]=count;
        }
        return res;
    }
}