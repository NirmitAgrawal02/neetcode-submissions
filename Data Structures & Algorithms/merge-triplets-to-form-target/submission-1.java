class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean first = false, second = false, third = false;
        for(int[] i : triplets)
        {
            if(target[0] == i[0] && !first)
            {
                if(i[1] <= target[1] && i[2] <= target[2])
                {
                    first = true;
                }
            }
            if(target[1] == i[1] && !second)
            {
                if(i[0] <= target[0] && i[2] <= target[2])
                {
                    second = true;
                }
            }
            if(target[2] == i[2] && !third)
            {
                if(i[0] <= target[0] && i[1] <= target[1])
                {
                    third = true;
                }
            }
            if(first && second && third)
            {
                return true;
            }
        }
        return false;
    }
}
