class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;
        s = s.toLowerCase();
        while(left < right)
        {
            while(left < s.length() && !((s.charAt(left) >= '0' && s.charAt(left) <= '9') || (s.charAt(left) >= 'a' && s.charAt(left) <= 'z')))
            {
                left++;
            }
            while(right >= 0 && !((s.charAt(right) >= '0' && s.charAt(right) <= '9') || (s.charAt(right) >= 'a' && s.charAt(right) <= 'z')))
            {
                right--;
            }
            if(left >= s.length() || right < 0)
            {
                return true;
            }
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
