class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] total = new int[amount + 1];
        Arrays.fill(total, amount + 1);
        int i = 1;
        total[0] = 0;
        while(i <= amount)
        {
            for(int j = 0; j < coins.length; j++)
            {
                if(coins[j] <= i)
                {
                    total[i] = Math.min(total[i], total[i - coins[j]] + 1);
                }
            }
            i++;
        }
        if(total[amount] > amount)
        {
            return -1;
        }
        return total[amount];
    }
}
