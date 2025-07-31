class Solution {
    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0 ; j < grid[0].length;j++){
                if(grid[i][j] == 1){
                    sum = sum + getCount(grid, i, j);
                }
            }
        }
        return sum;
    }
    public static int getCount(int[][] arr, int i,int j){
        int count = 4;
        if(j >= 1 && arr[i][j - 1] == 1){
            count -= 1;
        }
        if(i >= 1 && arr[i - 1][j] == 1){
            count -= 1;
        }
        if(j <= arr[0].length- 2  && arr[i][j + 1] == 1){
            count -= 1;
        }
        if(i <= arr.length - 2 && arr[i + 1][j] == 1){
            count -= 1;
        }
        return count;
    }
}