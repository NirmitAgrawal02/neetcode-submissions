/**
Test Cases:
Weight = [11,12,13], days = 3
Answer = 13

Solution ? 
Math.ceil(Sum of Weights / Days) 
Weight[i] < 
*/
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        if(weights.length == 0)
        {
            return 0;
        }
        int s = 0, m = 0;
        for(int weight: weights)
        {
            s+= weight;
            m = Math.max(m, weight);
        }
        int value = s;
        while(m <= s)
        {
            int mid = (m + s) / 2;
            if(canShip(weights,days,mid))
            {
                value = Math.min(value,mid);
                s = mid - 1;
            }
            else
            {
                m = mid +1;
            }
        }
        return value;
    }
    private boolean canShip(int[] weights, int days, int cap)
    {
        int s = 1, currentCap = cap;
        for(int w : weights)
        {
            if(currentCap - w < 0)
            {
                s++;
            if(s > days)
            {
                return false;
            }
            currentCap = cap;
            }
            currentCap -=w;
        }
        return true;
    }
}