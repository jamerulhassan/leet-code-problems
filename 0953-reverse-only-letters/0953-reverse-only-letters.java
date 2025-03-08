class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int L=0,R=arr.length-1;
        while(L < R){
            while(L < R && !Character.isAlphabetic(arr[L])){
                L++;
            }
            while(L < R && !Character.isAlphabetic(arr[R])){
                R--;
            }
            char temp = arr[L];
            arr[L] = arr[R];
            arr[R] = temp;
            L++;
            R--;
        }
        return new String(arr);
    }
}