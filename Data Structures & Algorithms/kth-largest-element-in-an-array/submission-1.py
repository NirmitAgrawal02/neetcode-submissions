class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        i,length = 0,len(nums)
        while i < len(nums):
            val = max(nums)
            k = k - 1
            if k == 0:
                return val
            j = nums.index(val)
            del nums[j]
        