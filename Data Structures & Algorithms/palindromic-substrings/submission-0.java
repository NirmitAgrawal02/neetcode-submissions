class Solution {
    public int countSubstrings(String s) {
        int res = 0;
        for(int i = 0; i < s.length(); i++)
        {
          res += recurssion(s, i, i);
          res += recurssion(s, i, i + 1);
        }
        return res;
    }
    public int recurssion(String palindrome, int i, int j)
    {
      int res = 0;
      while(i >= 0 && j < palindrome.length() && palindrome.charAt(i) == palindrome.charAt(j))
      {
        res++;
        i--;
        j++;
      }
      return res;
    }
}
