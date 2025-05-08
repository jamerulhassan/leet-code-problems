class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i = 0;i <= n;i++){
            if(Math.pow(2,i) <= n){
                if(Math.pow(2,i) == n) return true;
            }else{
                break;
            }
        }
        return false;
    }
}