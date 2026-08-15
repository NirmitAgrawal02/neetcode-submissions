class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 0 && nums2.length == 0)
        {
            return 0.0;
        }
        int length = nums1.length + nums2.length;
        boolean odd = false;
        if(length % 2 == 1)
        {
            odd = true;
        }
        length = length / 2;
        int j = 0, k =  0;
        double medium = 0.0, temp = 0.0;
        for(int i = 0;i <= length; i++)
        {
            if(j < nums1.length && k < nums2.length)
            {
                if(nums1[j] > nums2[k])
                {
                    temp = nums2[k];
                    k++;
                }
                else
                {
                    temp = nums1[j];
                    j++;
                }
            }
            else if(j < nums1.length)
            {
                temp = nums1[j];
                j++;
            }
            else if(k < nums2.length)
            {
                temp = nums2[k];
                k++;
            }
            if(odd)
            {
                medium = temp;
            }
            else
            {
                if(i == length - 1 || i == length)
                {
                    medium += temp;
                }
            }
        }
        if(!odd)
        {
            medium /= 2;
        }
        return medium;
    }
}
