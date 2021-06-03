package June2021Challenge;

public class MaxAreaIsland {

    public static void main(String[] args) {
        Island obj = new Island();
        System.out.println(obj.maxAreaOfIsland(new int[][]{{0,0,1,0,0,0,0,1,0,0,0,0,0},
        {0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,1,1,0,1,0,0,0,0,0,0,0,0},
        {0,1,0,0,1,1,0,0,1,0,1,0,0},
        {0,1,0,0,1,1,0,0,1,1,1,0,0},
        {0,0,0,0,0,0,0,0,0,0,1,0,0},
        {0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,0,0,0,0,0,0,1,1,0,0,0,0}}));
    }
}

class Island {

    public int maxAreaOfIsland(int[][] grid) {

        int max_count = 0;
        for (int i =0; i < grid.length; i++) {
            for (int j =0; j < grid[i].length; j++) {
                max_count = Math.max(max_count, dfs(grid, i, j));
            }
        }
        return max_count;
    }

    public int dfs(int[][] grid, int i, int j) {
        int count = 1;
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        count += dfs(grid, i + 1, j);
        count += dfs(grid, i - 1, j);
        count += dfs(grid, i, j + 1);
        count += dfs(grid, i, j - 1);
        return count;
    }
}
