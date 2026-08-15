class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxHeight = 0;
        for(int i = 0; i < heights.length; i++)
        {
            int height = 0, minHeight = heights[i];
            for(int j = i + 1; j < heights.length; j++)
            {
                minHeight = Math.min(minHeight, heights[j]);
                int area = minHeight * (j - i +1);
                height = Math.max(height,area);
            }
            height = Math.max(height, heights[i]);
            maxHeight = Math.max(height, maxHeight);
        }
        return maxHeight;
    }
}
