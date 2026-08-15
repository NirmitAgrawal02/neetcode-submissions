class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        if(n == 0)
        {
            return res;
        }
        while(n != 0)
        {
            if(n > 0)
            {
                res = res * x;
                n--;
            }
            else
            {
                double val = 1;
                val = val / x;
                res = res * val;
                n++;
            }
        }
        return res;
    }
}
