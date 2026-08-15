class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1)
        {
            return stones[0];
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : stones)
        {
            maxHeap.add(i);
        }
        while(!maxHeap.isEmpty())
        {
            int a = maxHeap.poll();
            if(maxHeap.isEmpty())
            {
                return a;
            }
            int b = maxHeap.poll();
            if(a == b)
            {
                continue;
            }
            maxHeap.add(Math.abs(a - b));
        }
        return 0;
    }
}
