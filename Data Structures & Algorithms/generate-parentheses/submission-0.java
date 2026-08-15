class Solution {
    public List<String> generateParenthesis(int n) {
        HashSet<String> set  = new HashSet<>();
        List<String> result = new ArrayList<>();
        set.add("()");
        if(n == 1)
        {
            result.add("()");
            return result;
        }
        for(int i = 1; i < n; i++)
        {
            HashSet<String> temp  = new HashSet<>();
            for(String st : set)
            {
                int j = st.length();
                System.out.println(st);
                for(int k = 0; k < j; k++)
                {
                    String ch = st;
                    ch = ch.substring(0, k) + '(' + ch.substring(k) + ')';
                    
                    if(!temp.contains(ch))
                    {
                        temp.add(ch);
                    }
                }
                temp.add(st + '(' + ')');
            }
            set = temp;
        }
        for(String st : set)
        {
            if(st.length() == n * 2)
            {
                result.add(st);
            }
        }
        return result;
    }
}
