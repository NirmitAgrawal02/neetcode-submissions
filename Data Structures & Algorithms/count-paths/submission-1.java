class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] totalPaths = new int[m][n];
        return dfs(0, 0, totalPaths);
        
    }
    public int dfs(int i, int j, int[][] totalPaths)
    {
        if(i == totalPaths.length - 1 && j == totalPaths[0].length - 1)
        {
            System.out.println(i + " " + j);
            return 1;
        }
        if(i < totalPaths.length && j < totalPaths[0].length)
        {
            totalPaths[i][j] = dfs(i + 1, j, totalPaths) + dfs(i, j + 1, totalPaths);
            
        }
        else
        {
            return 0;
        }
        return totalPaths[i][j];
    }
}
