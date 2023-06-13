class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int[] r: grid)
        {
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<r.length;i++)
            {
                sb.append(r[i]+" ");
            }
            String str = sb.toString();
            map.put(str,map.getOrDefault(str,0)+1);
        }
        int count=0;
        for(int j=0;j<grid[0].length;j++)//iterating over columns
        {
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<grid.length;i++)//iterating over row elements of particular column
            {
                sb.append(grid[i][j]+" ");
            }
            String str = sb.toString();
            if(map.get(str)!=null)
            {
                count+=map.get(str);
            }
        }
        return count;
    }
}