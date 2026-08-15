class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1)
        {
            return 0;
        }
        int left = 0, right = 1;
        int profit = prices[right] - prices[left];
        while(right < prices.length)
        {
            if(prices[right] < prices[left])
            {
                left = right;
            }
            if(profit < prices[right] - prices[left])
            {
                profit = prices[right] - prices[left];
            }
            right++;
        }
        return profit;
    }
}
