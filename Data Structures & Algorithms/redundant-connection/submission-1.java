class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> edge = new ArrayList<>();
        for(int i = 0 ; i <= edges.length; i++)
        {
            edge.add(new ArrayList<>());
        }
        int[] connections = new int[edges.length+1];
        for(int i = 0; i < edges.length; i++)
        {
            int u = edges[i][0];
            int v = edges[i][1];
            edge.get(u).add(v);
            edge.get(v).add(u);
            connections[u]++;
            connections[v]++;
        }
        int[] visited = new int[edges.length + 1];
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= edges.length; i++)
        {
            if(connections[i] == 1)
            {
                visited[i] = 1;
                queue.add(i);
            }
        }
        while(!queue.isEmpty())
        {
            int ch = queue.poll();
            for(Integer k : edge.get(ch))
            {
                connections[k]--;
                if(connections[k] == 1 && visited[k] == 0) 
                {
                    queue.add(k);
                    visited[k] = 1;
                }
            }
        }
        for(int i = edges.length - 1; i >= 0; i--)
        {
            int u = edges[i][0];
            int v = edges[i][1];
            if(visited[u] == 0 && visited[v] == 0)
            {
                return edges[i];
            }
        }
        return new int[2];
    }
}
