class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtracking(result, nums, 0, temp);
        return result;
    }
    public void backtracking(List<List<Integer>> result, int[] nums, int i, List<Integer> subset)
    {
        if(i >= nums.length)
        {
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        backtracking(result, nums, i + 1, subset);
        subset.remove(subset.size() - 1);
        backtracking(result, nums, i+1,subset);
    }
}
