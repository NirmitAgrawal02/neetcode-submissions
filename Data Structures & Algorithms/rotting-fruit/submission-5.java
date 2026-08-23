class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid.length == 0)
        {
            return -1;
        }
        int[][] directions = {{0,1}, {1,0}, {-1,0},{0,-1}};
        int initialRotten = 0, count = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < grid.length;i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                if(grid[i][j] == 2)
                {
                    queue.add(new int[] {i, j});
                    initialRotten++;
                }
                if(grid[i][j] == 1)
                {
                    count++;
                }
            }
        }
        if(count == 0)
        {
            return 0;
        }
        int tempCount = 0;
        int minutes = 0;
        while(!queue.isEmpty())
        {
            int[] rottonOrange = queue.poll();
            int r = rottonOrange[0];
            int c = rottonOrange[1];
            initialRotten--;
            for(int[] direction : directions)
            {
                int newRow = r + direction[0];
                int newColumn = c + direction[1];
                if(newRow >= grid.length || newRow < 0 || newColumn >= grid[newRow].length || newColumn < 0)
                {
                    continue;
                }
                if(grid[newRow][newColumn] == 1)
                {
                    grid[newRow][newColumn] = 2;
                    queue.add(new int[] {newRow,newColumn});
                    count--;
                    tempCount++;
                }
            }
            if(initialRotten == 0)
            {
                initialRotten = tempCount;
                tempCount = 0;
                minutes++;
            }
            if(count == 0)
            {
                if(tempCount == 0)
                return minutes;
                else
                return minutes+1;
            }
        }
        return -1;
    }
}
