class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] >  0)
            {
                return result;
            }
            if(i > 0 && nums[i] == nums[i - 1])
            {
                continue;
            }
            int low = i + 1;
            int high = nums.length - 1;
            List<Integer> val = new ArrayList<>();
            while(low < high)
            {
                if(nums[i] + nums[low] + nums[high] == 0)
                {
                    val.add(nums[i]);
                    val.add(nums[low]);
                    val.add(nums[high]);
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low - 1])
                    {
                        low++;
                        if(nums[high] == nums[high + 1])
                        {
                            high--;
                        }
                    }
                }
                else if(nums[i] + nums[low] + nums[high] > 0)
                {
                    high--;
                    continue;
                }
                else
                {
                    low++;
                    continue;
                }
            }
            
        }
        return result;
    }
}