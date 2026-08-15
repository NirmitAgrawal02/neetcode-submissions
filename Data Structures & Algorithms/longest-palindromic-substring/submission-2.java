class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1)
        {
            return s;
        }
        String res = "" + s.charAt(0);
        int maxLength = 1;
        for(int i = 0; i < s.length();i++)
        {
            int j = i + 1, k = i - 1;
            int length = 1;
            while(k >= 0 && j < s.length() && s.charAt(k) == s.charAt(j))
            {
                length += 2;
                if(maxLength < length)
                {
                    maxLength = length;
                    res = s.substring(k, j + 1);
                }
                k--;
                j++;
            }
            k = i;
            j = i + 1;
            length = 0;
            while(k >= 0 && j < s.length() && s.charAt(k) == s.charAt(j))
            {
                length += 2;
                if(maxLength < length)
                {
                    maxLength = length;
                    res = s.substring(k, j + 1);
                }
                k--;
                j++;
            }
        }
        return res;
    }
}
