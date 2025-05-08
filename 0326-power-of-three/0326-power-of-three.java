class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i = 0;i < n;i++){
            if(Math.pow(3,i) <= n){
                if(Math.pow(3,i) == n) return true;
            }else{
                break;
            }
        }
        return false;
    }
}