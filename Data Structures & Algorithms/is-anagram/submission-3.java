class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character,Integer> characterCount = new HashMap<>();
        for(char c:s.toCharArray())
        {
            if (characterCount.containsKey(c))
            {
                characterCount.put(c,characterCount.get(c) + 1);
            }
            else
            {
                characterCount.put(c,1);
            }
        }
        for(char c: t.toCharArray())
        {
            if((! characterCount.containsKey(c)) || characterCount.get(c) == 0)
            {
                return false;
            }
            characterCount.put(c,characterCount.get(c) - 1);
        }
        return true;
    }
}
