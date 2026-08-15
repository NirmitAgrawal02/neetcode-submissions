class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int minVal = nums[0];
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(nums[mid] < minVal)
            {
                minVal = nums[mid];
                high = mid;
            }
            else
            {
                low = mid + 1;
            }
        }
        return minVal;
    }
}
