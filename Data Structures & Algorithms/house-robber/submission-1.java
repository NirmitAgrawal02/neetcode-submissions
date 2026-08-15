class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
        {
            return nums[0];
        }
        int[] values = new int[nums.length];
        for(int i =  0; i < values.length; i++)
        {
            values[i] = -1;
        }
        dfs(0, nums.length, nums, values);
        dfs(1, nums.length, nums, values);
        return Math.max(values[0], values[1]);
    }
    public int dfs(int i, int length, int[] nums, int[] values)
    {
        if(i >= length)
        {
            return 0;
        }
        if(values[i] != -1)
        {
            return values[i];
        }
        values[i] = Math.max(dfs(i + 2, length, nums,values), dfs(i + 3, length, nums, values)) + nums[i];
        return values[i];
    }
}
