class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer,int[]> map = new HashMap<>();
        int m = mat.length;
        int n = mat[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                map.put(mat[i][j],new int[]{i,j});
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            int[] loc = map.get(arr[i]);
            int x = loc[0];
            int y = loc[1];
            row[x]++;
            col[y]++;
            if(row[x]==n || col[y]==m)
                //why we are checking row with n where n = column length this is because we are trying to find if occurence of a particular values covers all the columns of a row
                return i;
        }
        return arr.length-1;
    }
}