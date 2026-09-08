class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int i : nums)
        {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<int[]> maxPQ = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));
        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet())
        {
            int[] val = new int[2];
            val[0] = entry.getKey();
            val[1] = entry.getValue();
            maxPQ.offer(val);
        }
        int[] res = new int[k];
        int i = 0;
        while(i < k)
        {
            int[] ans = maxPQ.poll();
            res[i] = ans[0];
            i++;
        }
        return res;
    }
}
