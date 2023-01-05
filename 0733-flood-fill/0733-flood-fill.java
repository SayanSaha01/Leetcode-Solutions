class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int scolor = image[sr][sc];
        
        if(image[sr][sc]==color)    //if the starting sr,sr is the color itself
            return image;
        
        dfs(image,sr,sc,scolor,color);
        return image;
    }
    public void dfs(int[][] image,int i,int j,int scolor,int target)
    {
        if(i>=0 && i<image.length && j>=0 && j<image[0].length && image[i][j]==scolor)
        {
            image[i][j]=target;
            dfs(image,i+1,j,scolor,target);
            dfs(image,i-1,j,scolor,target);
            dfs(image,i,j+1,scolor,target);
            dfs(image,i,j-1,scolor,target);
        }
    }
}