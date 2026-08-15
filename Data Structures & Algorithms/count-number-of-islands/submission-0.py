class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return 0

        rows,cols = len(grid), len(grid[0])
        islands = 0 
        visited = [[0 for i in range(len(grid[0]))] for j in range(len(grid))]

        def bfs(row,col):
            q = collections.deque()
            visited[row][col] = True
            q.append((row,col))

            while q:
                r,c = q.popleft()
                directions = [[-1,0],[1,0],[0,-1],[0,1]]
                for dr, dc in directions:
                    if ((r + dr) in range(rows) and (c + dc) in range(cols) and 
                    grid[r + dr][c + dc] == '1' and not visited[r + dr][c + dc]):
                        q.append((r + dr,c+dc))
                        visited[r + dr][c + dc] = True        
        for row in range(rows):
            for col in range(cols):
                if grid[row][col] == '1' and not visited[row][col]:
                    bfs(row, col)
                    islands += 1
        return islands




