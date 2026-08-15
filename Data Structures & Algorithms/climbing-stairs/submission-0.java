class Solution {
    public int climbStairs(int n) {
        int count = 0;
        return dfs(n , count);
    }
    public int dfs(int n, int count)
    {
        if(n < 0)
        {
            return count;
        }
        if(n == 0)
        {
            return 1;
        }
        return dfs(n - 1, count) + dfs(n - 2, count);
    }
}
