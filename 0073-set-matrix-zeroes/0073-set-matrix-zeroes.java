class Solution {
    public void setZeroes(int[][] arr) {
        System.out.println();
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[0].length;j++){
                if(arr[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i=0;i < row.size();i++){
            changeArray(row.get(i),col.get(i),arr);
        }
    }
    static void changeArray(int row,int col,int[][] arr){
        for(int j=0;j < arr.length;j++){
            arr[j][col] = 0;
        }
        for(int k=0;k < arr[0].length;k++){
            arr[row][k] = 0;
        }
    }
}