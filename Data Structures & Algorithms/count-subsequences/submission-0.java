class Solution {
    public int numDistinct(String s, String t) {
        if(t.length() > s.length())
        {
            return 0;
        }
        int[][] dp = new int[s.length() + 1][t.length() +1];
        for(int i = 0; i < dp.length; i++)
        {
            for(int j = 0; j < dp[0].length; j++)
            {
                dp[i][j] = -1;
            }
        }
        return dfs(s,t,0,0, dp);
    }
    public int dfs(String s, String t, int i, int j,int[][] dp)
    {
        
        if(j == t.length())
        {
            return 1;
        }
        if(i == s.length())
        {
            return 0;
        }
        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }
        int res = dfs(s,t,i+1,j,dp);
        if(s.charAt(i) == t.charAt(j))
        {
            res += dfs(s,t,i+1, j+1, dp);
        }
        dp[i][j] = res;
        return res;
    }
}
