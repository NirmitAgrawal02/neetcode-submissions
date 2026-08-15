class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyTime = Integer.MAX_VALUE;
        int sellTime = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] > sellTime)
            {
                sellTime = prices[i];
            }
            if(prices[i] < buyTime)
            {
                buyTime = prices[i];
                sellTime = 0;
            }
            
            profit = Math.max(profit, sellTime - buyTime);
        }
        return profit;
    }
}
