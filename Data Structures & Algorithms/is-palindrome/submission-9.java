class Solution {
    public boolean isPalindrome(String s) {
        String res = "";
        s = s.toLowerCase();
        for(char ch : s.toCharArray())
        {
            if((ch >= 'a' && ch<='z') || (ch >= '0' && ch<= '9'))
            {

                res += ch;
            }
        }
        int i = 0, j = res.length() - 1;
        while(i < j)
        {
            if(res.charAt(i) != res.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
