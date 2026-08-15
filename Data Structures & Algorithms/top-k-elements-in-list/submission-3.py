class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counter = {}
        res = []
        for n in nums:
            counter[n] = 1 + counter.get(n,0)
        while k > 0:
            val = max(counter.values())
            for c,v in counter.items():
                if v == val:
                    res.append(c)
                    counter[c] = -1
                    k -= 1
        return res
        
        # counter = {}
        # for n in nums:
        #     counter[n] = 1 + counter.get(n,0)
        # res = [[] for i in rrange(len(nums) + 1)]
        
        # for n,c in counter.items():
        #     res[c].append(n)

        # sol = []
        # for i in range(len(res) - 1, 0, -1):
        #     for n in res[i]:
        #         sol.append(n)
        #         if len(sol) == k:
        #             return sol



        # return result