class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int res = Integer.MIN_VALUE;
        int prefix = 1, suffix = 1;
        for( int i = 0; i < nums.length; i++)
        {
            if(prefix == 0)
            {
                prefix = 1;
            }
            if(suffix == 0)
            {
                suffix = 1;
            }
            prefix = nums[i] * prefix;
            suffix = nums[n - 1 - i] * suffix;
            res = Math.max(res, Math.max(prefix, suffix)); 
        }
        return res;
    }
}
