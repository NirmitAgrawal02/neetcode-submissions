class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == "")
        {
            return 0;
        }
        if(s.length() == 1)
        {
            return 1;
        }
        int left = 0, right = 1;
        int maxLength = 1;
        HashSet<Character> hm = new HashSet<>();
        hm.add(s.charAt(left));
        while(right < s.length())
        {
            if(hm.contains(s.charAt(right)))
            {
                if(maxLength < right - left)
                {
                    maxLength = right - left;
                }
                while(s.charAt(left) != s.charAt(right))
                {
                    hm.remove(s.charAt(left));
                    left++;
                }
                hm.remove(s.charAt(left));
                left++;
            }
            hm.add(s.charAt(right));
            right++;
        }
        if(right - left > maxLength)
        {
            maxLength = right - left;
        }
        return maxLength;
    }
}
