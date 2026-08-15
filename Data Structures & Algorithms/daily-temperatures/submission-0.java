class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for(int i = result.length - 2; i >= 0; i--)
        {
            if(temperatures[i] < temperatures[i + 1])
            {
                result[i] = 1;
            }
            else
            {
                int n = 1;
                while(i + n < temperatures.length)
                {
                    if(temperatures[i]  < temperatures[i + n])
                    {
                        result[i] = n;
                        break;
                    }
                    if(result[i + n ] == 0)
                    {
                        break;
                    }
                    n += result[i+n];
                }
            }
        }
        return result;
    }
}
