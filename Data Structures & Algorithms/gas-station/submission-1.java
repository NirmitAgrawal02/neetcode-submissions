class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index = -1, diff = 0;
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
            return -1;
        }
        for(int i = 0; i < gas.length; i++)
        {
            diff += gas[i] - cost[i];
            if(index < 0 && diff >= 0)
            {
                index = i;
            }
            if(diff < 0)
            {
                index = -1;
                diff = 0;
            }
        }
        return index;
    }
}
