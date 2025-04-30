class Solution {
    public boolean findRotation(int[][] arr, int[][] target) {
       return istrueOrFalse(arr,target,0);
    }
    static boolean istrueOrFalse(int[][] arr,int[][] target,int ptr){
        if(ptr == 4){
            return false;
        }
        int[][] temp = new int[arr.length][arr.length];
        for(int i=0;i < arr.length;i++){
            for(int j = 0;j < arr.length;j++){
                temp[j][i] = arr[arr.length - i -1][j];
            }
        }   
        if(isSame(temp,target)){
            return true;
        }
        else{
            return istrueOrFalse(temp,target,ptr+1);
        } 
    }
    static boolean isSame(int[][] temp,int[][] target){
        for(int i = 0 ; i < target.length ; i++){
            for(int j=0;j < target[0].length;j++){
                if(target[i][j] != temp[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}        

















        /* int[][] temp = new int[arr.length][arr[0].length];
        istrueOrFalse(0,0,arr,temp);
        for(int[] nums : temp){
            System.out.println(Arrays.toString(nums));
        }
        for(int i = 0 ; i < target.length ; i++){
            for(int j=0;j < target[0].length;j++){
                if(target[i][j] != temp[i][j]){
                    return false;
                }
            }
        }
        return true; */
    
    
