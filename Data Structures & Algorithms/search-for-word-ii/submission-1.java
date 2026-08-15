class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> word = new ArrayList<>();
        boolean[] found = new boolean[words.length];
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                for(int k = 0; k < words.length; k++)
                {
                    if(words[k].charAt(0) == board[i][j] && !found[k])
                    {
                        boolean[][] visited = new boolean[board.length][board[0].length];
                        if(dfs(words[k], board, visited, 0, i ,j))
                        {
                            found[k] = true;
                            word.add(words[k]);
                        }
                    }
                }
            }
        }
        return word;
    }
    public boolean dfs(String word, char[][] board, boolean[][] visited, int index, int i, int j)
    {
        if(index == word.length())
            {
                return true;
            }
        if(i >= 0 && i < board.length && j >= 0 && j < board[0].length && !visited[i][j] && board[i][j] == word.charAt(index))
        {
            visited[i][j] = true;
            return dfs(word, board,visited, index+1, i - 1, j) || dfs(word, board,visited, index+1, i + 1, j) ||  dfs(word, board,visited, index+1, i , j - 1) ||  dfs(word, board,visited, index+1, i , j + 1); 
        }
        return false;
    }
}
