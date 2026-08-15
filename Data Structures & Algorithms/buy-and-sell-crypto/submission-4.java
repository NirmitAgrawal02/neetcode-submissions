class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, buy = prices[0];
        for(int price = 1; price < prices.length;price++)
        {
            if(prices[price] < buy)
            {
                buy = prices[price];
            }
            else
            maxProfit = Math.max(maxProfit, prices[price] - buy);
        }
        return maxProfit;
    }
}
