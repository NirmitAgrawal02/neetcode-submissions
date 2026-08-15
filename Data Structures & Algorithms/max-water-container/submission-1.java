class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int leftMax = heights[left], rightMax = heights[right];
        int result = 0;
        while(left < right)
        {
            int j = Math.min(rightMax, leftMax);
            int container = j * (right - left);
            result = Math.max(result, container);
            if(rightMax < leftMax)
            {
                right--;
                rightMax = heights[right];
            }
            else
            {
                left++;
                leftMax = heights[left];
            }
        }
        return result;   
    }
}
