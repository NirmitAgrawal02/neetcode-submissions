class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 1)
        {
            return nums;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int[] result = new int[nums.length - k + 1];
        int input = 0;
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], i);
            pq.offer(nums[i]);
            if(i + 1 >= k && !pq.isEmpty())
            {
                int val = 0;
                boolean check = true;
                while(!pq.isEmpty() && check)
                {
                    val = pq.poll();
                    if(map.get(val) < input)
                    {
                        if(map.get(val) + k - 1 < input)
                        {
                        pq.offer(val);
                        check = false;
                        }
                    }
                    else if(map.get(val) >= input)
                    {
                        if(map.get(val) <=  input + k - 1)
                        {
                            pq.offer(val);
                            check = false;
                        }
                    }
                }
                result[input++] = val;   
            }
        }
        while(input < result.length && !pq.isEmpty())
        {
            int val = pq.poll();
            if(map.get(val) - k + 1 <= input)
            {
                result[input++] = val;
                pq.offer(val);
            }
        }
        return result;
    }
}
