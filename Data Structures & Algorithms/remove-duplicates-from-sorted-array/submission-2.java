class Solution {
    public int removeDuplicates(int[] nums) {
      int left = 1;
      int right = 1;
      HashSet<Integer> set = new HashSet<>();
      set.add(nums[0]);
      while(left < nums.length && right < nums.length)
      {
        if(set.contains(nums[left]))
        {
            while(set.contains(nums[right]))
            {
                right++;
                if(right == nums.length)
                {
                    break;
                }
            }
            if(right == nums.length)
            {
                break;
            }
            int l = nums[left]; 
            nums[left] = nums[right];
            nums[right] = l;
            set.add(nums[left]);
            left++;
            right++;
        }
      else
      {
        set.add(nums[left]);
        left++;
      }
      }
    return left;
    }
}