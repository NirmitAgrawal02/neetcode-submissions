class Solution {
    HashMap<Integer,List<Integer>> map = new HashMap<>();
    Stack<Integer> stack = new Stack<>(); 
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] result = new int[numCourses];
        int j = 0;
        for(int i  = 0; i < numCourses; i++)
        {
            map.put(i, new ArrayList<>());
        }
        for(int[] pre : prerequisites)
        {
            map.get(pre[0]).add(pre[1]);
        }
        List<Integer> output = new ArrayList<>();
        Set<Integer> visit = new HashSet<>();
        Set<Integer> cycle = new HashSet<>();
        for(int i = 0; i < numCourses; i++)
        {
            if(!dfs(i, visit, cycle, output))
            {
                return new int[0];
            }
        }
        for(int i = 0; i < numCourses;i++)
        {
            result[i] = output.get(i);
        }
        return result;
    }
    public boolean dfs(int cur, Set<Integer> visit, Set<Integer> cycle,List<Integer> output)
    {
        if(visit.contains(cur))
        {
            return false;
        }
        if(cycle.contains(cur))
        {
            return true;
        }
        visit.add(cur);
        for(int c : map.get(cur))
        {
            if(!dfs(c, visit, cycle, output))
            {
                return false;
            }
        }
        visit.remove(cur);
        cycle.add(cur);
        map.put(cur, new ArrayList<>());
        output.add(cur);
        return true;
    }   
}
