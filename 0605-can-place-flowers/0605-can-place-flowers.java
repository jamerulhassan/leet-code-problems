class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        if(n == 0) return true;
        if(arr.length == 1 && arr[0] == 0) return true;
        if(arr.length == 1 && arr[0] == 1) return false;
        for(int i = 0; i < arr.length; i++){
            if((i > 0 && i < arr.length -1) && (arr[i] != 1 && arr[i-1] != 1 && arr[i+1] != 1)){
                n--;
                arr[i] = 1;
                if(n == 0){
                    return true;
                }
            }else if(i == 0 && arr[i] != 1 && arr[i+1] != 1){
                n--;
                arr[i] = 1;
                if(n == 0){
                    return true;
                }
            }else if(i == arr.length -1 &&  arr[i] != 1 && arr[i-1] != 1){
                n--;
                arr[i] = 1;
                if(n == 0){
                    return true;
                }
            }
        }
        return false;
    }
}