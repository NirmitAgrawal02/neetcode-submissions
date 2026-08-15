class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        characterCount = {}
        for i in s:
            characterCount[i] = 1 + characterCount.get(i,0)
        
        for j in t:
            if j not in characterCount:
                return False
            elif characterCount[j] < 1:
                return False
            else:
                characterCount[j] -= 1
        if max(characterCount.values()) > 0:
            return False
        return True