class Solution {
    public char nextGreatestLetter(char[] arr, char t) {
        for(int i= 0 ; i < arr.length; i++){
            if(t < arr[i]){
                return arr[i];
            }
        }
        return arr[0];
    }
}