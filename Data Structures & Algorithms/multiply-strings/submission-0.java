class Solution {
    public String multiply(String num1, String num2) {
        HashMap<Character, Integer> value = new HashMap<>();
        for(char ch = '0'; ch <= '9'; ch++)
        {
            int i = ch- 48;
            value.put(ch, i);
        }
        long val1 = convertToInt(num1, value);
        long val2 = convertToInt(num2, value);
        if(val1 == 0 || val2 == 0)
        {
            return "0";
        }
        long val = val1 * val2;
        long n = val;
        String res = "";
        res = "" + n;
        return res;
    }
    public long convertToInt(String num, HashMap<Character, Integer> value)
    {
        long result = 0;
        for(char c: num.toCharArray())
        {
            result = result * 10 + value.get(c);
        }
        return result;
    }
}
