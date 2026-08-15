class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        visited = [[False for j in range(len(grid[0]))] for i in range(len(grid))]
        rows,cols = len(grid), len(grid[0])
        count = [0]
        def bfs(row,col):
            area = 1
            visited[row][col] = True
            q = collections.deque()
            q.append((row,col))
            while q:
                row,col =  q.popleft()
                direction = [(-1,0),(1,0),(0,-1),(0,1)]
                for dr,dc in direction:
                    if row + dr in range(rows) and col + dc in range(cols) and not visited[row + dr][col + dc] and grid[row + dr][col + dc] == 1:
                        area += 1
                        visited[row + dr][col + dc] = True
                        q.append((row + dr, col + dc))
            count[0] = max(count[0],area)
        
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if not visited[i][j] and grid[i][j] == 1:
                    bfs(i,j)
        return count[0]
