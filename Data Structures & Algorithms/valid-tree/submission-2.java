class Solution {
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> nodes = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            nodes.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++)
        {
            nodes.get(edges[i][0]).add(edges[i][1]);
            nodes.get(edges[i][1]).add(edges[i][0]);
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, -1});
        Set<Integer> visit = new HashSet<>();
        visit.add(0);
        while(!queue.isEmpty())
        {
            int[] val = queue.poll();
            for(Integer i : nodes.get(val[0]))
            {
                if(i == val[1])
                {
                    continue;
                }
                if(visit.contains(i))
                {
                    return false;
                }
                visit.add(i);
                queue.offer(new int[] {i, val[0]});
            }
        }
        return visit.size() == n;
    }
}
