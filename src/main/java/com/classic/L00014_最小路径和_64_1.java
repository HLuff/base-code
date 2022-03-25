package com.classic;

public class L00014_最小路径和_64_1 {

    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        return func(grid, 0, 0);
    }

    public int func(int[][] grid, int row, int col){
        if(row == grid.length - 1 && col == grid[0].length - 1){
            return grid[row][col];
        }
        if(row == grid.length - 1){
            return grid[row][col] + func(grid, row, col + 1);
        }
        if(col == grid[0].length - 1){
            return grid[row][col] + func(grid, row + 1, col);
        }

        int p1 = grid[row][col] + func(grid, row, col + 1);
        int p2 = grid[row][col] + func(grid, row + 1, col);

        return Math.min(p1, p2);
    }
}
