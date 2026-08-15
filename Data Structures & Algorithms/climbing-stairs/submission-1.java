class Solution {
    public int climbStairs(int n) {
        int[] count = new int[n + 1];
        return dfs(n , count);
    }
    public int dfs(int n, int[] count)
    {
        if(n < 0)
        {
            return 0;
        }
        if(n == 0)
        {
            return 1;
        }
        if(count[n] > 0)
        {
            return count[n];
        }
        return dfs(n - 1, count) + dfs(n - 2, count);
    }
}
