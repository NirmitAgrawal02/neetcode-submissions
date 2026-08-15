class Solution {
    public int orangesRotting(int[][] grid) {
        int count = 0, rottonCount = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 1)
                {
                    count++;
                }
                else if(grid[i][j] == 2)
                {
                    rottonCount++;
                    queue.add(new int[]{i, j});
                }
            }
        }
        if(count == 0)
        {
            return 0;
        }
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0, -1}};
        int minutes = 1, tempCount = 0;
        while(!queue.isEmpty())
        {
            int[] pos = queue.poll();
            int r = pos[0];
            int c = pos[1];
            for(int[] dir : directions)
            {
                int nr = r + dir[0];
                int nc = c + dir[1];
                if(0 <= nr && nr < grid.length && 0 <= nc && nc < grid[0].length && grid[nr][nc] == 1)
                {
                    grid[nr][nc] = 2;
                    queue.add(new int[]{nr,nc});
                    tempCount ++;
                    count--;
                }
            }
            rottonCount--;
            if(count == 0)
            {
                return minutes;
            }
            if(rottonCount == 0 && tempCount == 0)
            {
                return -1;
            }
            else if(rottonCount == 0)
            {
                rottonCount = tempCount;
                tempCount = 0;
                minutes++;
            }

        }
        return -1;
    }
}
