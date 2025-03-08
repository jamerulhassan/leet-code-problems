class Solution {
    public String reverseVowels(String s) {
        char[] VOWELS={'a','A','e','E','i','I','o','O','u','U'};
        char[] arr=s.toCharArray();
        int L=0;
        int R=arr.length-1;
        while(L < R){
            while(L < R && !isVowel(VOWELS,arr[L])){
                L++;
            }
            while(L < R && !isVowel(VOWELS,arr[R])){
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
    public static boolean isVowel(char[] VOWELS,char element){
        for(int i=0;i < VOWELS.length;i++){
            if(VOWELS[i] == element){
                return true;
            }
        }
        return false;
    }
}