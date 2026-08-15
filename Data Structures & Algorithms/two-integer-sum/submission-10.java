class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        int[] result = new int[2];
        for(int i = 1; i < nums.length; i++)
        {
            int difference = target - nums[i];
            if(map.containsKey(difference))
            {
                result[0] = map.get(difference);
                result[1] = i;
                return result;
            }
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
