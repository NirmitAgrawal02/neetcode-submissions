class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];
        int j = nums.length - 1;
        for(int i = 0; i < nums.length; i++)
        {
            if(i == 0 && j == nums.length - 1)
            {
                prefix[i] = nums[i];
                suffix[j] = nums[j];
            }
            else
            {
                prefix[i] = prefix[i - 1] * nums[i];
                suffix[j] = suffix[j + 1] * nums[j];
            }
            j -= 1;
        }
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println(suffix[i]);
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(i == 0)
            {
                result[i] = suffix[i + 1];
            }
            else if(i == nums.length - 1)
            {
                result[i] = prefix[i - 1];
            }
            else 
            {
                result[i] = prefix[i - 1] * suffix[i + 1];
            }
        }
        return result;
    }
}  
