class Solution {
    public int[][] matrixReshape(int[][] arr, int r, int c) {
        if((arr.length * arr[0].length) != (r * c)){
            return arr;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int[][] res = new int[r][c];
        for(int i = 0; i < arr.length;i++){
            for(int j = 0;j < arr[0].length;j++){
                list.add(arr[i][j]);
            }
        }
        int k = 0;
        for(int l = 0; l < res.length;l++){
            for(int m = 0;m < res[0].length;m++){
                res[l][m] = list.get(k++);
            }
        }
        return res;
    }
    /* static void add(int element,int[][] res,int row,int col){
        if(res[row][col] == 0){
            res[row][col] = element;
        }
        else{
            res[row + 1][col + 1] = element;
        }
    } */
}