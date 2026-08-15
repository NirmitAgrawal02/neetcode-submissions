class Solution {
    public int[] sortArray(int[] nums) {
        MergeSort(0, nums.length - 1, nums);
        return nums;
    }
    public void MergeSort(int i, int length, int[] nums)
    {
        if(i >= length)
        {
            return;
        }
        MergeSort(i, (i + length) / 2, nums);
        MergeSort((i + length) / 2 + 1, length, nums);
        Merge(nums, i, (i + length)/ 2, length);
    }
    public void Merge(int[] arr, int l, int m, int r)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = l;
        int j = m + 1;
        while(i <= m && j <= r)
        {
            if(arr[i] <= arr[j])
            {
                temp.add(arr[i]);
                i++;
            }
            else
            {
                temp.add(arr[j]);
                j++;
            }
        }
        while (i <= m) {
            temp.add(arr[i]);
            i++;
        }

        while (j <= r) {
            temp.add(arr[j]);
            j++;
        }
        for (i = l; i <= r; i++) {
            arr[i] = temp.get(i - l);
        }
    }
}