class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        
        int total = 0;
        int m = grid.length;
        int n = grid[0].length;
        
        boolean[][] visited = new boolean[m][n];
        int[][] dxy = {{-1, 0},{1, 0},{0, -1},{0, 1}};
        
        for (int i = 0; i < m; i++) {
           for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    total++;
                    Queue<int[]> q = new LinkedList<int[]>();
                    q.add(new int[]{i, j});
                    visited[i][j] = true;
                    
                    while (!q.isEmpty()) {
                        int[] xy = q.poll();
                        int x = xy[0];
                        int y = xy[1];                        
                            
                        for (int d= 0; d < 4; d++) {
                            int row = x + dxy[d][0];
                            int col = y + dxy[d][1];
                            if (row >=0 && row < m && col >= 0 && col < n && !visited[row][col] && grid[row][col] == '1') {
                                q.offer(new int[]{row, col});
                                visited[row][col] = true;
                            }
                        }
                    }
                }
            }
        }
        return total;
    }
}