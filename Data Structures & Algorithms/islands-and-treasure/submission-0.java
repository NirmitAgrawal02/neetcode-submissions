class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 0)
                {
                    queue.add(new int[]{i, j});
                }
            }
        }

        int[][] directions = {{1,0}, {-1, 0}, {0, 1}, {0 , -1}};
        while(!queue.isEmpty())
        {
            int[] points = queue.poll();
            int r = points[0];
            int c = points[1];
            for(int[] dir : directions)
            {
                int nr = r + dir[0];
                int nc = c + dir[1];
                if(0 <= nr && 0 <= nc && nr < grid.length && nc <grid[0].length && grid[nr][nc] == Integer.MAX_VALUE)
                {
                    grid[nr][nc] = grid[r][c] + 1;
                    queue.add(new int[]{nr, nc});
                }
                else
                {
                    continue;
                }
            }
        }
    }
}
