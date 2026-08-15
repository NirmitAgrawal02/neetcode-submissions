class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = []
        prefix = []
        postfix = []
        for i in range(len(nums)):
            res.append(0)
            if i == 0:
                prefix.append(nums[i])
            else:
                prefix.append(1)
            if i == len(nums) - 1:
                postfix.append(nums[i])
            else:
                postfix.append(1)
        
        j = len(nums) - 2
        for i in range(1,len(nums)):
            prefix[i] = prefix[i-1] * nums[i]
            postfix[j] = postfix[j+1] * nums[j]
            j -= 1
        print(prefix,postfix)
        for i in range(len(nums)):
            if i == 0:
                res[i] = postfix[i + 1]
            elif i == len(nums) - 1:
                res[i] = prefix[i-1]
            else:
                res[i] = prefix[i-1] * postfix[i + 1]
        return res


