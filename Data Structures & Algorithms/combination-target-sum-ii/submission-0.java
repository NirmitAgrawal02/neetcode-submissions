class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0 , 0, new ArrayList<>());
        return res;
    }
    public void backtrack(int[] candidates, int target, int i, int sum, List<Integer> values)
    {
        if(sum == target)
        {
            res.add(new ArrayList<>(values));
            return ;
        }
        for(int j = i; j < candidates.length; j++)
        {
            if (j > i && candidates[j] == candidates[j - 1]) {
                continue;
            }
            if(sum + candidates[j] > target)
            {
                break;
            }
            values.add(candidates[j]);
            backtrack(candidates, target, j + 1, sum + candidates[j], values);
            values.remove(values.size() - 1);         
        }
    }
}
