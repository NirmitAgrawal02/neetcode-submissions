class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length())
        {
            return "";
        }
        int[] freq = new int[140];
        String k = s;
        int totalCount = t.length();
        for(int i = 0; i < t.length(); i++)
        {
            freq[t.charAt(i)]++;
        }
        int[] val = new int[2];
        val[0] = s.length();
        val[1] = s.length();
        int left = 0, right = 0, minLength = Integer.MAX_VALUE;
        int[] freq2 = new int[140];
        while(right < s.length())
        {
            freq2[s.charAt(right) ]++;
            if(freq2[s.charAt(right)] <= freq[s.charAt(right)])
            {
                totalCount--;
            }
            while(totalCount == 0 && left <= right)
            {
                if(minLength > right - left + 1)
                {
                    minLength = right - left + 1;
                    val[0] = left;
                    val[1] = right;
                }
                freq2[s.charAt(left)]--;
                if(freq[s.charAt(left)] > 0 && freq[s.charAt(left)] > freq2[s.charAt(left)])
                {
                    totalCount++;
                }
                left++;
            
            }
            right++;
        }
        if(val[0] == s.length())
        {
            return "";
        }
        return k.substring(val[0], val[1] + 1);
    }
}
