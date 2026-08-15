class Solution {
    public void solve(char[][] board) {
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if(i > 0 && board[i - 1][j] == 'O')
                {
                    continue;
                }
                if(j > 0 && board[i][j - 1] == 'O')
                {
                    continue;
                }
                if(board[i][j] == 'O')
                {
                    if(board(board, i, j))
                    {
                        board[i][j] = 'X';
                    }
                }
            }
        }
    }
    public boolean board(char[][] board, int i , int j)
    {
        if(i >= 0 && j >= 0 && i < board.length && j < board[0].length && board[i][j] == 'X')
        {
            return true;
        }
        if(i >= 0 && j >= 0 && i < board.length && j < board[0].length && board[i][j] == 'O')
        {
            if(i == 0 || j == 0 || i == board.length - 1 || j == board[0].length - 1)
            {
                return false;
            }
            board[i][j] = 'X';
            boolean val = board(board, i + 1, j) && board(board, i - 1, j) && board(board, i, j - 1) && board(board, i, j + 1);
            board[i][j] = 'O';
            return val;
        }
        return false;
    }
}
