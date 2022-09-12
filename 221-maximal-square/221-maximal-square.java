/*class Solution {
    private int[][] mem;
    private int res=0;
    public int maximalSquare(char[][] matrix) {
        
        mem = new int[matrix.length][matrix[0].length];
        for(int[] rows: mem)
            Arrays.fill(rows, -1);
        solve(matrix, 0, 0);
        return res*res;
    }
    public int solve(char[][] matrix, int i, int j){
        if(i>=matrix.length || j>=matrix[0].length || matrix[i][j]=='0')
            return 0;
        if(mem[i][j]!=-1){
            return mem[i][j];
        }
        int down= solve(matrix, i+1, j);
        int dia= solve(matrix, i+1, j+1);
        int right= solve(matrix, i, j+1);
        if(matrix[i][j]=='1')
        {
            mem[i][j]= 1+ Math.min(down, Math.min(right, dia));
            res=Math.max(mem[i][j], res);
            return mem[i][j];
        }
        else{
            return 0;
        }
    }
}*/
class Solution {
    private int[][] mem;
    private int res=0;
    public int maximalSquare(char[][] matrix) {
        mem = new int[matrix.length][matrix[0].length];
        for(int[] rows: mem)
            Arrays.fill(rows, -1);
        solve(matrix, 0, 0);
        return res*res;
    }
    public int solve(char[][] matrix, int i, int j){
        if(i>=matrix.length|| j>=matrix[0].length)
            return 0;
        if(mem[i][j]!=-1){
            res=Math.max(res, mem[i][j]);
            return mem[i][j];
        }
        int down= solve(matrix, i+1, j);
        int dia= solve(matrix, i+1, j+1);
        int right= solve(matrix, i, j+1);
        if(matrix[i][j]=='1')
        {
            mem[i][j]= 1+ Math.min(down, Math.min(right, dia));
            res=Math.max(mem[i][j], res);
            return mem[i][j];
        }
        else
        {
            return 0;
        }
    }
}