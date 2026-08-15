class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return dfs(m - 1, n -1, dp);
    }
    public int dfs(int i, int j, int[][] dp)
    {
        if(i < 0 || j < 0)
        {
            return 0;
        }
        if(i == 0 && j == 0)
        {
            dp[i][j] = 1;
            return dp[i][j];
        }
        if(dp[i][j] > 0 )
        {
            return dp[i][j];
        }
        dp[i][j] = dfs(i - 1, j, dp) + dfs(i, j - 1, dp);
        return dp[i][j];
    }
}
