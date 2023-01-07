class Solution {
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        //finding out the 'O's in first and last row, iterating over all cols of first and last row
        for(int i=0;i<col;i++)
        {
            if(board[0][i]=='O')
            {
                dfs(board,0,i);
            }
            if(board[row-1][i]=='O')
            {
                dfs(board,row-1,i);
            }
        }
        // finding out the 'O's in first and last col,
        for(int i=0;i<row;i++)
        {
            if(board[i][0]=='O')
            {
                dfs(board,i,0);
            }
            if(board[i][col-1]=='O')
            {
                dfs(board,i,col-1);
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(board[i][j]=='@')
                    board[i][j]='O';
                else
                    board[i][j]='X';
            }
        }
    }
    public void dfs(char[][] board,int i,int j)
    {
        if(i>=0 && j>=0 && i<board.length && j<board[0].length && board[i][j]=='O')
        {
            board[i][j]='@';
            dfs(board,i+1,j);
            dfs(board,i-1,j);
            dfs(board,i,j-1);
            dfs(board,i,j+1);
        }
    }
}