class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0; i <= grid.length-1; i++){
            for(int j = 0; j <= grid[0].length-1; j++){
                if(grid[i][j] == 1){
                    int count = 0;
                    max = Math.max(max, dfs(grid, i, j, count));
                }
            }
        }
        return max;
    }
    private int dfs(int[][] grid, int i, int j, int count){
        if(grid[i][j] == 1){
            grid[i][j] = 2;
            count++;
            if(j >= 1) count = dfs(grid, i, j-1, count);//left
            if(j < grid[0].length-1) count = dfs(grid, i, j+1, count);//right
            if(1 <= i) count = dfs(grid, i-1, j, count);//up
            if(i < grid.length-1) count = dfs(grid, i+1, j, count);//down
        }
        return count;
    }
}

Runtime: 4 ms, faster than 56.02% of Java online submissions for Max Area of Island.
        Memory Usage: 47.3 MB, less than 48.49% of Java online submissions for Max Area of Island.


class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max_area = 0;
        for(int i = 0; i < grid.length; i++)
            for(int j = 0; j < grid[0].length; j++)
                if(grid[i][j] == 1)max_area = Math.max(max_area, AreaOfIsland(grid, i, j));
        return max_area;
    }

    public int AreaOfIsland(int[][] grid, int i, int j){
        if( i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1){
            grid[i][j] = 0;
            return 1 + AreaOfIsland(grid, i+1, j) + AreaOfIsland(grid, i-1, j) + AreaOfIsland(grid, i, j-1) + AreaOfIsland(grid, i, j+1);
        }
        return 0;
    }
}