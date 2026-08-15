class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
        {
            return nums[0];
        }
        int[] values = new int[nums.length];
        Arrays.fill(values, -1);
        int k = dfs(0, nums, values, true);
        Arrays.fill(values, -1);
        int v = dfs(1, nums, values, false);
        return Math.max(k,v);
    }
    public int dfs(int i, int[] nums, int[] values, boolean check)
    {
        if(i >= nums.length)
        {
            return 0;
        }
        if(i == nums.length - 1 && check)
        {
            return 0;
        }
        else if(i == nums.length - 1)
        {
            return nums[i];
        }
        if(values[i] != -1)
        {
            return values[i];
        }
        values[i] = Math.max(dfs(i + 1, nums, values, check), dfs(i + 2, nums, values, check) + nums[i]);
        return values[i];
    }
}
