class Solution {
    public int[][] transpose(int[][] matrix) {
        return getArray(matrix);
    }
    static int[][] getArray(int[][] arr){
        int[][] res = new int[arr[0].length][arr.length];
        for(int i = 0 ; i < arr[0].length ; i++){
            for(int j = 0;j < arr.length;j++){
                res[i][j] = arr[j][i];
            }
        }
        return res;
    }
}