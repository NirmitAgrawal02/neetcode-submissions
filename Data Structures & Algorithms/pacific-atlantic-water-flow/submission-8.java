class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[][] visited = new boolean[heights.length][heights[0].length];
        for(int i = 0; i < heights.length; i++)
        {
            for(int j = 0; j < heights[0].length; j++)
            {
                if(pacific(heights,i,j, visited, heights[i][j], 0) && pacific(heights, i, j, visited, heights[i][j], 1))
                {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    result.add(new ArrayList<>(temp));
                }
            }
        }
        return result;
    }
    public boolean pacific(int[][] heights, int i, int j, boolean[][] visited, int value, int turn)
    {
        if(i >= 0 && i < heights.length && j >= 0 && j < heights[0].length && !visited[i][j] && value >= heights[i][j])
        {
            if(turn == 0)
            {
                if(i == 0 || j == 0)
                {
                    return true;
                }
            }
            else
            {
                if(i == heights.length - 1 || j == heights[0].length - 1)
                {
                    return true;
                }
            }
            visited[i][j] = true;
            boolean v = pacific(heights, i + 1, j, visited, heights[i][j],turn) || 
                        pacific(heights, i - 1, j, visited, heights[i][j], turn) || 
                        pacific(heights, i, j + 1, visited, heights[i][j], turn) || 
                        pacific(heights, i, j - 1, visited, heights[i][j], turn);

            visited[i][j] = false;
            return v;
        }
        return false;
    }
}
