class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxSubwater = 0;
        while(left < right)
        {
            int area = right - left;
            area = area * Math.min(heights[right], heights[left]);
            if(area > maxSubwater)
            {
                maxSubwater = area;
            }
            if(heights[right] > heights[left])
            {
                left++;
            }
            else
            {
                right --;
            }
        }
        return maxSubwater;
    }
}
