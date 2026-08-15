/**
T0: Input: nums = [];
    Output: false;
What are the constraints -> is the input only numbers, or is it also character or string based too ? 
One Approach:
If numbers are only allowed : then we can use a single hashset to keep track of all the data given
T.C - O(n), O(n) -> When all the results are unique.

2nd Approach:
To Sort the data in sequential order

Naive Approach:
*/
class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length <= 1)
        {
            return false;
        }
        HashSet<Integer> str = new HashSet<>();
        for(int n : nums)
        {
            if(str.contains(n))
            {
                return true;
            }
            str.add(n);
        }
        return false;
    }
}
