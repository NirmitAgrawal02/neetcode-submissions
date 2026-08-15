class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counter = {}
        for n in nums:
            counter[n] = 1 + counter.get(n,0)
        res = [[] for i in range(len(nums) + 1)]
        
        for n,c in counter.items():
            res[c].append(n)

        sol = []
        for i in range(len(res) - 1, 0, -1):
            for n in res[i]:
                sol.append(n)
                if len(sol) == k:
                    return sol



        return result