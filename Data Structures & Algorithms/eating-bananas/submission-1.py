class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        # Brute Force Approach
        # for i in range(1,max(piles) + 1):
        #     val = 0
        #     for j in range(0,len(piles)):
        #         val += math.ceil(piles[j]/i)
        #     if val <= h:
        #         return i

        # Optimized Algorithm

        low,high,k = 1,max(piles) + 1,0
        val = sum(piles)
        while low <= high:
            k = 0
            mid = (low + high) // 2
            for i in piles:
                k += math.ceil(i/mid)
            if k <= h:
                high = mid - 1
            elif k > h:
                low = mid + 1
        return low


            
