class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        # Brute Force Approach
        for i in range(1,max(piles) + 1):
            val = 0
            for j in range(0,len(piles)):
                val += math.ceil(piles[j]/i)
            if val <= h:
                return i
            
