class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0) + 1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(map.entrySet());
        int[] result = new int[k];
        for(int i = 0; i < k; i++)
        {
            result[i] = maxHeap.poll().getKey();
        }
        return result;
    }
}
