class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int[][] arr = new int[m][n];
        for(int i=0;i < m;i++){
            for(int j=0;j < n;j++){
                arr[i][j]=0;
            }
        }
        incrementArray(arr,indices,m,n);
        for(int j=0;j < m;j++){
                for(int k = 0;k < n;k++){
                    if(arr[j][k] % 2 != 0){
                        count++;
                    }
                }
            }
       /*  //for display
        System.out.println("Ater performing operation");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        } */
        return count;
    }
    static void incrementArray(int[][] main,int[][] pos,int m,int n){
        for(int i=0;i < pos.length;i++){
            int row = pos[i][0];
            int col = pos[i][1];
            for(int j=0;j < m;j++){
                for(int k = 0;k < n;k++){
                    if(j == row){
                        main[j][k] = main[j][k]+1;
                    }
                    if(k == col){
                        main[j][k] = main[j][k] +1;
                    }
                }
            }
            /* System.out.println("during performing operation");
            for (int l = 0; l < main.length; l++) {
                for (int j = 0; j < main[i].length; j++) {
                    System.out.print(main[l][j] + " ");
                }
                System.out.println();
            } */
        }
    }
}