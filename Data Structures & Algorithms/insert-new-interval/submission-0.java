class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> list = new ArrayList<>();
        boolean hasAdded = false;
        for(int[] interval : intervals)
        {
            if(interval[1] < newInterval[0])
            {
              list.add(new ArrayList<>(Arrays.asList(interval[0], interval[1])));  
            }
            else if(interval[0] > newInterval[1])
            {
                if(!hasAdded)
                {
                    hasAdded = true;
                    list.add(new ArrayList<>(Arrays.asList(newInterval[0], newInterval[1])));
                }
                list.add(new ArrayList<>(Arrays.asList(interval[0], interval[1])));
            }
            else
            {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1],interval[1]);
            }
        }
        if(!hasAdded)
        {
            list.add(new ArrayList<>(Arrays.asList(newInterval[0], newInterval[1])));
        }
         return list.stream()
               .map(row -> row.stream().mapToInt(Integer::intValue).toArray())
               .toArray(int[][]::new);
    }
}
