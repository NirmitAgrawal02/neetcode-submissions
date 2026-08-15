class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            map.put(s.charAt(i), i);
        }
        List<Integer> result = new ArrayList<>();
        int size = 0, end = 0;
        for(int i = 0; i < s.length(); i++)
        {
            size++;
            end = Math.max(end, map.get(s.charAt(i)));
            if(i == end)
            {
                result.add(size);
                size = 0;
            }
        }
        return result;
    }
}
