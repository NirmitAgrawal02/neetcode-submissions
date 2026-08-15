class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Set<Character>> rows = new HashMap<>();
        HashMap<Integer, Set<Character>> cols = new HashMap<>();
        HashMap<Integer, Set<Character>> squares = new HashMap<>();
        for(int i = 0; i<board.length; i++)
        {
            for(int j = 0; j< board.length;j++)
            {
                char cell = board[i][j];
                if(cell == '.')
                {
                    continue;
                }
                if (rows.getOrDefault(i, new HashSet<>()).contains(cell)
                        || cols.getOrDefault(j, new HashSet<>()).contains(cell)
                        || squares.getOrDefault((i / 3) * 3 + j / 3, new HashSet<>()).contains(cell)) {
                    return false;
                }
                cols.computeIfAbsent(j, k -> new HashSet<>()).add(cell);
                rows.computeIfAbsent(i, k -> new HashSet<>()).add(cell);
                squares.computeIfAbsent((i / 3) * 3 + j / 3, k -> new HashSet<>()).add(cell);
            }
        }
        return true;
    }
}
