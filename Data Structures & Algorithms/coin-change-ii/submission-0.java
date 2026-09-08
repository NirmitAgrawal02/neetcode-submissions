class Solution {
    public int change(int amount, int[] coins) {
        int[][] total = new int[coins.length + 1][amount + 1];
        Arrays.sort(coins);
        for(int i = 0; i <= coins.length; i++)
        {
            total[i][0] = 1;
        }
        for(int i = coins.length - 1; i >= 0; i--)
        {
            for(int j = 0; j <= amount;j++)
            {
                if(j >= coins[i])
                {
                    total[i][j] = total[i + 1][j];
                    total[i][j] += total[i][j - coins[i]]; 
                }
            }
        }
        return total[0][amount];
    }
}
