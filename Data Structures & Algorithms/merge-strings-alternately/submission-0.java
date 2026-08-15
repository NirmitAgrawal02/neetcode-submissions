class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a = 0;
        String res = "";
        while(a < word1.length() && a < word2.length())
        {
          char temp = word1.charAt(a);
          res += temp;
          temp = word2.charAt(a);
          res += temp;
          a++;
        }
        if(a < word2.length())
        {
          res += word2.substring(a);
        }
        else if(a < word1.length())
        {
          res += word1.substring(a);
        }
        return res;
    }
}