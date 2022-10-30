class Solution {
    public void solve(char[][] board) {
        // traversing on the top and bottom rows
        for(int i=0;i<board[0].length;i++)
        {
            if(board[0][i]=='O')
            {
                dfs(board,0,i);
            }
            if(board[board.length-1][i]=='O')
            {
                dfs(board,board.length-1,i);
            }
        }
        
        // 2nd Loop : Traversing over left & right col, to find any 'O' present by the boundary
        for(int j=0; j<board.length; j++){
            if(board[j][0] == 'O')
            {
                dfs(board, j, 0);
            }
            if(board[j][board[0].length-1]=='O')
            {
                dfs(board, j, board[0].length - 1);
            }
        }
        
        //flipping the remaining
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='O')
                {
                    board[i][j]='X';
                }
                else if(board[i][j]=='@')
                {
                    board[i][j]='O';
                }
            }
        }
    }
    public void dfs(char[][] board,int i,int j)
    {
        if(i>=0 && i<=board.length-1 && j>=0 && j<=board[0].length-1 && board[i][j]=='O')
        {
            board[i][j]='@';
            dfs(board,i+1,j);
            dfs(board,i-1,j);
            dfs(board,i,j+1);
            dfs(board,i,j-1);
        }
    }
}