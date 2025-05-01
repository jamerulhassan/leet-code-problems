class Solution {
    public List<Integer> luckyNumbers(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i < arr.length;i++){
            for(int j=0;j < arr[0].length;j++){
                if(isCorrect(arr[i][j],i,j,arr)){
                    list.add(arr[i][j]);
                }
            }
        }
        return list;
    }
    static boolean isCorrect(int element,int i,int j,int[][] arr){
        for(int k = 0 ; k < arr.length;k++){
            if(element < arr[k][j]){
                return false;
            }
        }
        for(int k = 0 ; k < arr[0].length;k++){
            if(element > arr[i][k]){
                return false;
            }
        }
        return true;
    }
}