/**
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

*/
class Solution {
    public int maxProfit(int[] prices) {
        int maxValue = 0,  minVal = Integer.MAX_VALUE;
        for(int price : prices)
        {
            minVal = Math.min(minVal, price);
            maxValue = Math.max(maxValue, price - minVal);
        }
        return maxValue;
    }
}