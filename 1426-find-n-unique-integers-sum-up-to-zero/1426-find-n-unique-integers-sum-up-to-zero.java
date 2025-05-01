class Solution {
    public int[] sumZero(int n) {
        int k = -1,l = 1,i = 0;
        int[] res = new int[n];

        if(!isEven(n)){
            res[i++] = 0;
        }

        while(i < res.length){
            if(isEven(i)){
                res[i++] = k--;
            }
            else{
                res[i++] = l++;
            }
        }
        return res;
    }
    static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
}