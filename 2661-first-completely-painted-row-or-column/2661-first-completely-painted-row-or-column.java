class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        HashMap<Integer,int[]> map = new HashMap<>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                map.put(mat[i][j],new int[]{i,j});
            }
        }
        
        int[] row = new int[m];
        int[] col = new int[n];
        
        for(int i=0;i<arr.length;i++)
        {
            int[] loc = map.get(arr[i]);
            int x = loc[0];
            int y = loc[1];
            row[x]++;
            col[y]++;
            if(row[x]==n || col[y]==m)
                return i;
        }
        return arr.length-1;
    }
}