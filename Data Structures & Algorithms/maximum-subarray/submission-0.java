class Solution {
    public int maxSubArray(int[] nums) {
        // return dfs(nums, 0, nums.length - 1);
        int maxSub = nums[0], curSum = 0;
        for(int num: nums)
        {
            if(curSum < 0)
            {
                curSum = 0;
            }
            curSum += num;
            maxSub = Math.max(maxSub, curSum);
        }
        return maxSub;
    }
    // public int dfs(int[] nums, int l, int r)
    // {
    //     if(l > r)
    //     {
    //         return Integer.MIN_VALUE;
    //     }
    //     int m = (l + r)
    // }
}
