class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> count = new HashSet<>();
        do
        {
            int temp = n;
            if(count.contains(n))
            {
                return false;
            }
            count.add(n);
            int s = 0;
            while(temp > 0)
            {
                int digit = temp % 10;
                digit *= digit;
                s += digit;
                temp /= 10;
            }
            n = s;
        }while(n != 1);
        return true;
    }
}
