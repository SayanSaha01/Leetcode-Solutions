return max;
}
}
*/
​
class Solution {
public int cherryPickup(int[][] grid) {
int m=grid.length;
int n=grid[0].length;
int dp[][][]=new int [m][n][n];
for(int row[][]:dp){
for(int col[]:row)
Arrays.fill(col,-1);
}
return f(0,0,n-1,m,n,grid,dp);
}
public static int f(int i,int j1,int j2,int m,int n,int[][] grid,int[][][] dp){
if(j1<0 || j1>=n || j2<0 || j2>=n)
return Integer.MIN_VALUE;
if(i==m-1){
if(j1==j2)
return grid[i][j1];
else
return grid[i][j1]+grid[i][j2];
}
if(dp[i][j1][j2]!=-1)
return dp[i][j1][j2];
int max=Integer.MIN_VALUE;
for(int dj1=-1;dj1<=1;dj1++){
for(int dj2=-1;dj2<=1;dj2++){
int value=0;
if(j1==j2)
value=grid[i][j1];
else
value=grid[i][j1]+grid[i][j2];
value+=f(i+1,j1+dj1,j2+dj2,m,n,grid,dp);
max=Math.max(max,value);
}
}
return dp[i][j1][j2]=max;
}
}