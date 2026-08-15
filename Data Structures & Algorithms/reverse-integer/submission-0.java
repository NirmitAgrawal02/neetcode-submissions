class Solution {
    public int reverse(int x) {
        long a = 0;
        int check = 1;
        if(x < 0)
        {
            check = -1;
            x = x * -1;
        }
        while(x > 0)
        {
            int mod = x % 10;
            a = a * 10 + mod;
            x = x / 10;
        }
        a = a * check;
        if(a > Integer.MAX_VALUE || a < Integer.MIN_VALUE)
        {
            return 0; 
        }
        return (int) a;


    }
}
