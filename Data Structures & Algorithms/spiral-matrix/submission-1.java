class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r0 =0, rl = matrix.length - 1, c0 = 0, cl = matrix[0].length - 1;
        int[] pos = new int[2];
        pos[0] = 0;
        pos[1] = 0;
        int visited = 0, total = matrix.length * matrix[0].length;
        List<Integer> result = new ArrayList<>(); 
        int direction = 1;
        while(visited < total)
        {
            if(direction == 1 && pos[1] <= cl)
            {
                result.add(matrix[pos[0]][pos[1]]);
                visited++;
                if(pos[1] == cl)
                {
                    direction++;
                    r0++;
                    pos[0]++;
                }
                else
                {
                    pos[1]++;
                }
            }
            else if(direction == 2 && pos[0] <= rl)
            {
                result.add(matrix[pos[0]][pos[1]]);
                visited++;
                if(pos[0] == rl)
                {
                    direction++;
                    cl--;
                    pos[1]--;
                }
                else
                {
                    pos[0]++;
                }
            }
            else if(direction == 3 && pos[0] >= c0)
            {
                result.add(matrix[pos[0]][pos[1]]);
                visited++;
                if(pos[1] == c0)
                {
                    direction++;
                    rl--;
                    pos[0]--;
                }
                else
                {
                    pos[1]--;
                }
            }
            else if(direction == 4 && pos[0] >= r0)
            {
                result.add(matrix[pos[0]][pos[1]]);
                visited++;
                if(pos[0] == r0)
                {
                    direction = 1;
                    c0++;
                    pos[1]++;
                }
                else
                {
                    pos[0]--;
                }
            }
        }
        return result;

    }
}
