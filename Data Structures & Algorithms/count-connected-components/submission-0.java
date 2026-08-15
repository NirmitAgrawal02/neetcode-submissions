class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> edgeList = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            edgeList.add(new ArrayList<>());
        }
        for(int[] i: edges)
        {
            edgeList.get(i[0]).add(i[1]);
            edgeList.get(i[1]).add(i[0]);
        }
        boolean[] visit = new boolean[n];
        int count = 0;
        for(int i = 0; i < n;i++)
        {
            if(!visit[i])
            {
                bfs(edgeList, visit, i);
                count++;
            }
        }
        return count;
    }
    private void bfs(List<List<Integer>> adj, boolean[] visit, int i)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        visit[i] = true;
        while(!queue.isEmpty())
        {
            int curr = queue.poll();
            for(int nei : adj.get(curr))
            {
                if(!visit[nei])
                {
                    visit[nei] = true;
                    queue.offer(nei);
                }
            }
        }
    }
}
