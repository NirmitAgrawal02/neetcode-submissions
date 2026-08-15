class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int[] maxCount = new int[1];
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length;j++)
            {
                if(grid[i][j] == 1)
                {
                    maxCount[0] = Math.max(maxCount[0], dfs(grid, i ,j));
                }
            }
        }
        return maxCount[0];
    }
    public int dfs(int[][] grid, int i, int j)
    {
        if(i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1)
        {
            int count = 1;
            grid[i][j] = 0;
            count += dfs(grid, i+1, j);
            count += dfs(grid, i-1, j);
            count += dfs(grid, i, j - 1);
            count += dfs(grid, i, j + 1);
            return count;
        }
        else
        {
            return 0;
        }
        
    }
}
