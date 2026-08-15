class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freqMap = new int[26];
        for(char ch : s1.toCharArray())
        {
            freqMap[ch - 'a']++;
        }
        int left = -1;
        int count = s1.length();
        for(int i = 0; i < s2.length(); i++)
        {
            char ch = s2.charAt(i);
            if(freqMap[ch - 'a'] == 0 && count == s1.length())
            {
                continue;
            }
            System.out.println(count + " " + ch);
            if(freqMap[ch - 'a'] > 0 && left < 0)
            {
                freqMap[ch - 'a']--;
                left = i;
                count--;
            }
            else  if(freqMap[ch - 'a'] > 0)
            {
                freqMap[ch - 'a']--;
                count--;

            }
            else if(freqMap[ch - 'a'] == 0 && count < s1.length() && count != 0)
            {
                while(left < i && s2.charAt(i) != s2.charAt(left))
                {
                    ch = s2.charAt(left);
                    freqMap[ch - 'a']++;
                    left++;
                    count++;

                }
                if(left == i)
                {
                    left = -1;
                    count = s1.length();

                }
                else
                {
                    left ++;                
                }
            }
            if(count == 0)
            {
                return true;
            }
        }
        return false;
    }
}
