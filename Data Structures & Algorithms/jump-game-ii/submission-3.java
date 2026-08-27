class Solution {
    public int jump(int[] nums) { // 2,3,0,1,4
        int[] dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE - 1);
        dp[nums.length - 1] = 0; // MAX,MAX,MAX,MAX,0
        for(int i = nums.length - 2; i >= 0; i--) // 1 
        {
            int maxValue = Math.min(nums[i] + i, nums.length - 1); // 4 
            for(int j = i + 1; j <= maxValue; j++) // 4
            {

                dp[i] = Math.min(dp[j] + 1, dp[i]); // 2 
            }
        }
        return dp[0];
    }
}
