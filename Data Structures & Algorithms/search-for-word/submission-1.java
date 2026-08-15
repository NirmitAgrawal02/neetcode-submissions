class Solution {
    private int r, c;
    public boolean exist(char[][] board, String word) {
        r = board.length;
        c = board[0].length;
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if(word.charAt(0) == board[i][j])
                {
                    
                   
                    
                    if(dfs(word, board, i, j, 0))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(String word, char[][] board, int i, int j, int idx)
    {
        if(idx == word.length())
        {
            return true;
        }
        if(i < 0 || j < 0 || i >= r || j >= c || board[i][j] != word.charAt(idx) || board[i][j] == '#')
        {
            return false;
        }
        board[i][j] = '#';
        boolean res = dfs( word, board, i + 1, j, idx + 1) || dfs(word, board, i - 1, j, idx +1) || dfs( word, board,i, j + 1, idx + 1) || dfs(word,board,  i, j - 1, idx + 1);
        board[i][j] = word.charAt(idx);
        return res;
    }
}
