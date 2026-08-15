class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        low = 0
        high = len(matrix) - 1
        while low <= high:
            mid = (low + high) // 2
            if matrix[mid][0] == target:
                return True
            elif matrix[mid][0] > target:
                high = mid - 1
            else:
                low = mid + 1
        low -= 1
        low1 = 0
        print(low)
        high1 = len(matrix[0]) - 1
        while low1 <= high1:
            mid = (low1 + high1) // 2
            if matrix[low][mid] == target:
                return True
            elif matrix[low][mid] > target:
                high1 = mid - 1
            else:
                low1 = mid + 1
        return False
        