class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];
        int j = nums.length - 1;
        for(int i = 0; i<nums.length;i++)
        {
            if(i == 0)
            {
                prefix[0] = nums[0];
                suffix[j] = nums[j];
            }
            else
            {
                prefix[i] = prefix[i-1] * nums[i];
                suffix[j] = suffix[j+1] * nums[j];
            }
            j--;
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(i == 0)
            {
                result[i] = suffix[i+1];
            }
            else if(i == nums.length - 1)
            {
                result[i] = prefix[i -1];
            }
            else
            {
                result[i] = prefix[i-1] * suffix[i+1];
            }
        }
        return result;
    }
}  
