//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    Set<List<Integer>> set = new HashSet<>();
    int countDistinctIslands(int[][] grid) {
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    List<Integer> list = new ArrayList<>();
                    dfs(i,j,grid,list,i,j);
                    set.add(list);
                }
            }
        }
        return set.size();
    }
    public void dfs(int i,int j,int[][] grid, List<Integer> list,int sr,int sc)
    {
        if(i>=0 && j>=0 && i<=grid.length-1 && j<=grid[0].length-1 && grid[i][j]==1)
        {
            grid[i][j]=0;
            list.add(sr-i);
            list.add(sc-j);
            dfs(i+1,j,grid,list,sr,sc);
            dfs(i-1,j,grid,list,sr,sc);
            dfs(i,j+1,grid,list,sr,sc);
            dfs(i,j-1,grid,list,sr,sc);
        }
        
    }
}
