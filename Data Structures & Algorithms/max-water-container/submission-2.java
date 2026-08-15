class Solution {
    public int maxArea(int[] heights) {
        int total = 0, left = 0, right = heights.length - 1;
        while(left < right)
        {
            if(heights[left] < heights[right])
            {
            total = Math.max(total, heights[left] * (right - left));
                left++;
            }
            else
            {
                 total = Math.max(total, heights[right] * (right - left));
                right--;
            }
        }
        return total;
    }
}
