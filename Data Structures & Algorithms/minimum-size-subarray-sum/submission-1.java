class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length <= 0)
        {
            return 0;
        }
        int mcount = Integer.MAX_VALUE, left = 0, sum = nums[0];
        for(int right = 1; right <= nums.length; right++)
        {
            while(sum >= target && left < right)
            {
                sum = sum - nums[left];
                left++;
                mcount = Math.min(mcount, (right - left) + 1);
            }
            if(right == nums.length)
            {
                break;
            }
            sum += nums[right];
        }
        if(mcount == Integer.MAX_VALUE)
        {
            return 0;
        }
        return mcount;
    }
}