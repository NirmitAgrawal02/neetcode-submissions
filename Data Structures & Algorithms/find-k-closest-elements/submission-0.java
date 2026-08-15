class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0, right = arr.length - 1, count = 0, excludeCount = arr.length - k;
        List<Integer> result = new ArrayList<>();
        while(count < excludeCount)
        {
            if(Math.abs(arr[left] - x) > Math.abs(arr[right] - x))
            {
                left++;
            }
            else
            {
                right--;
            }
            count++;
        }
        while(left <= right)
        {
            result.add(arr[left]);
            left++;
        }
        return result;
    }
}