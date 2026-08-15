class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        int[] ch = new int[26];
        int length = s.length();
        for(int i = 0; i < length; i++)
        {
            char c = s.charAt(i);
            char second = t.charAt(i);
            ch[c - 'a']++;
            ch[second - 'a']--;
        }
        for(int i = 0; i < 26; i++)
        {
            if(ch[i] != 0)
            {
                return false;
            }
        }
        return true;
    }
}
