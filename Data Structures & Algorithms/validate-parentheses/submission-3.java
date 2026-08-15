class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}', '{');
        map.put(']','[');
        Stack<Character> store = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(store.isEmpty() || map.get(s.charAt(i)) != store.peek())
                {
                    return false;
                }
                store.pop();
            }
            else
            {
                store.push(s.charAt(i));
            }
        }
        if(store.isEmpty())
            return true;
        return false;
    }
}
