class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i : nums)
        {
            set.add(i);
        }
        for(int n : set)
        {
            int j = n;
            int c = 1;
            while(set.contains(j + 1))
            {
                c++;
                j += 1;
            }
            j = n;
            while(set.contains(j - 1))
            {
                c++;
                j -= 1;
            }
            count = Math.max(count, c);
        }
        return count;
    }
}
