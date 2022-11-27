class Solution {
    public int pivotInteger(int n) {
        int leftsum=0;
        for(int i=1;i<=n;i++)
        {
            leftsum+=i;
            int rightsum=0;
            for(int j=i;j<=n;j++)
            {
                rightsum+=j;
            }
            if(leftsum==rightsum)
               return i;
        }
        return -1;
    }
}