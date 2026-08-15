class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] values = new int[amount  +1];
        Arrays.fill(values, amount + 1);
        if(amount == 0)
        {
            return 0;
        }
        values[0] = 0;
        for(int i = 1; i <= amount; i++)
        {
            for(int j = 0; j < coins.length; j++)
            {
                if(coins[j] <= i)
                {
                    values[i] = Math.min(values[i], values[i - coins[j]] + 1);
                }
            }
        }
        return values[amount] > amount ? -1 : values[amount];
    }
}
