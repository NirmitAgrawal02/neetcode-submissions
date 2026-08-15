class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        List<List<Integer>> res = new ArrayList<>();
        boolean val = false;
        for(int i = 1; i < intervals.length; i++)
        {
            if(intervals[i-1][1] < intervals[i][0])
            {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(intervals[i - 1][0]);
                list.add(intervals[i - 1][1]);
                System.out.println(intervals[i][0]);
                res.add(new ArrayList<>(list));
            }
            else
            {
                intervals[i][0] = intervals[i - 1][0];
                intervals[i][1] = Math.max(intervals[i-1][1], intervals[i][1]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(intervals[intervals.length - 1][0]);
        list.add(intervals[intervals.length - 1][1]);
        res.add(new ArrayList<>(list));
        int[][] result = new int[res.size()][2];
        for(int i = 0; i < res.size();i++)
        {
            List<Integer> v = res.get(i);
            result[i][0] = v.get(0);
            result[i][1] = v.get(1);
        }
        return result;
    }
}
