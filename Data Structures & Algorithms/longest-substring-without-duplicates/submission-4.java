class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> map = new HashSet<>();
        if(s.length() == 0)
        {
            return 0;
        }
        int left = 0, right = 1, maxCount = 0;
        map.add(s.charAt(left));
        while(right < s.length())
        {
            maxCount = Math.max(maxCount, right - left);
            while(left < right && map.contains(s.charAt(right)) )
            {
                map.remove(s.charAt(left));
                left++;
            }
            map.add(s.charAt(right));
            right++;
        }
        maxCount = Math.max(maxCount, right - left);

        return maxCount;
    }
}
