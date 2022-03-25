package com.classic;

public class L00014_最小路径和_64_3 {

    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        return func(grid, 0, 0);
    }

    public int func(int[][] grid, int i, int j){
        if(i == grid.length - 1 && j == grid[0].length - 1){
            return grid[i][j];
        }
        if(i == grid.length - 1){
            return grid[i][j] + func(grid, i, j + 1);
        }
        if(j == grid[0].length - 1){
            return grid[i][j] + func(grid, i + 1, j);
        }

        int p1 = grid[i][j] + func(grid, i, j + 1);
        int p2 = grid[i][j] + func(grid, i + 1, j);

        return Math.min(p1, p2);
    }
}
