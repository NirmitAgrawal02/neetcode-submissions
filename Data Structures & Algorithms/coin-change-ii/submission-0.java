class Solution {
    public int change(int amount, int[] coins) {
        int[] count = new int[amount + 1];
        count[0] = 1;
        for(int i = coins.length - 1; i >= 0; i--)
        {
            for(int a = 1; a <= amount; a++)
            {
                count[a] = count[a] + (coins[i] <= a ? count[a - coins[i]] : 0);
            }
        }
        return count[amount];
    }
}
