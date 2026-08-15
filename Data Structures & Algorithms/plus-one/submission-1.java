class Solution {
    public int[] plusOne(int[] digits) {
        int[] res = new int[digits.length +1];
        for(int i = digits.length - 1; i >= 0; i--)
        {
            if(digits[i] != 9)
            {
                digits[i] += 1;
                return digits;
            }
            else
            {
                digits[i] = 0;
                res[i+1] = digits[i];
            }
        }
        res[0] = 1;
        return res;
    }
}
