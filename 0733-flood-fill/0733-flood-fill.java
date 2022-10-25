class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int target = image[sr][sc]; //storing the original color
        
        if(image[sr][sc]==color)    //if the image contains the color itself
            return image;
        
        dfs(image,sr,sc,target,color);
        return image;
    }
    public void dfs(int[][] image,int row,int col,int target,int newcolor)
    {
    if(row>=0 && row<image.length && col>=0 && col<image[0].length && image[row][col]==target)
        {
            image[row][col] = newcolor;
            dfs(image,row-1,col,target,newcolor);
            dfs(image,row,col+1,target,newcolor);
            dfs(image,row+1,col,target,newcolor);
            dfs(image,row,col-1,target,newcolor);
        }
    }
}