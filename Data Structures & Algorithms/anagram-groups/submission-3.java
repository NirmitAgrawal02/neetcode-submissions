class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < strs.length; i++)
        {
            int[] freq = new int[26];
            if(set.contains(i))
            {
                continue;
            }
            set.add(i);
            String str = strs[i];
            List<String> res = new ArrayList<>();
            res.add(str);
            for(char ch : str.toCharArray())
            {
                freq[ch - 'a']++;
            }
            for(int j = i + 1; j < strs.length;j++)
            {
                int[] freq2 = new int[26];
                String str2 = strs[j];
                for(char ch : str2.toCharArray())
                {
                    freq2[ch - 'a']++;
                }
                boolean isEqual = true;
                for(int k = 0; k < 26; k++)
                {
                    if(freq2[k] != freq[k])
                    {
                        isEqual = false;
                        break;
                    }
                }
                if(isEqual)
                {
                    res.add(str2);
                    set.add(j);
                }
            }
            result.add(res);
        }
        return result;
    }
}
