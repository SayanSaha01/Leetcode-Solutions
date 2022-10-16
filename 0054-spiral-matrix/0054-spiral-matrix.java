/*class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int left = 0;
        int right = matrix[0].length-1;
        int start = 0;
        int bottom = matrix.length-1;
        while(start<=bottom && left<=right)
        {
            // Top Right row
            for(int i=left;i<=right;i++)
            {
                list.add(matrix[start][i]);
            }
            start++;
            // Right Down column
            for(int i=start;i<=bottom;i++)
            {
                list.add(matrix[i][right]);
            }
            right--;
            // Bottom Left row
            if(start<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // Left Up row
           if(left<=right)
           {
                for(int i=bottom;i>=start;i--)
                {
                    list.add(matrix[i][left]);
                }
                left++;
           }
        }
        return list;
    }
}*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>(); 
        if (matrix == null || matrix.length == 0) return res;
        int n = matrix.length, m = matrix[0].length;
        int up = 0,  down = n - 1;
        int left = 0, right = m - 1;
        while (res.size() < n * m) {
            for (int j = left; j <= right && res.size() < n * m; j++)
                res.add(matrix[up][j]);
            
            for (int i = up + 1; i <= down - 1 && res.size() < n * m; i++)
                res.add(matrix[i][right]);
                     
            for (int j = right; j >= left && res.size() < n * m; j--)
                res.add(matrix[down][j]);
                        
            for (int i = down - 1; i >= up + 1 && res.size() < n * m; i--) 
                res.add(matrix[i][left]);
                
            left++; right--; up++; down--; 
        }
        return res;
    }
}