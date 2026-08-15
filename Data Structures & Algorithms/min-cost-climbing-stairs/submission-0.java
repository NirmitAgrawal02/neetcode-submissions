class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] minCost = new int[cost.length];
        if(cost.length <= 2)
        {
            return 0;
        }
        for(int i = 0; i < cost.length; i++)
        {
            if(i == 0 || i == 1)
            {
                minCost[i] = cost[i];
                continue;
            }
            minCost[i] = Math.min(minCost[i - 1] + cost[i], minCost[i - 2] + cost[i]);
        }
        int min = Math.min(minCost[cost.length - 1], minCost[cost.length - 2]);
        return min;
    }
    
}
