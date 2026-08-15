class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyTime = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < buyTime)
            {
                buyTime = prices[i];
            }
            
            profit = Math.max(profit, prices[i] - buyTime);
        }
        return profit;
    }
}
