class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++)
        {
            if(i > 0 && nums[i] == nums[i - 1])
            {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right)
            {
                if(right + 1 < nums.length && nums[right] == nums[right + 1])
                {
                    right--;
                    continue;
                }
                if(left - 1 > i && nums[left] == nums[left - 1])
                {
                    left++;
                    continue;
                }
                if(nums[i] + nums[left] + nums[right] == 0)
                {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(new ArrayList<>(temp));
                    right--;
                    left++;
                }
                else if(nums[i] + nums[left] + nums[right] > 0)
                {
                    right --;
                }
                else
                {
                    left ++;
                }
            }
        }
         return result;
    }
}
