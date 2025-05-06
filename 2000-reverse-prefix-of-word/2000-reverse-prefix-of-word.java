class Solution {
    public String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch);

        char[] arr = word.toCharArray();

        int left = 0,rigth = i;
        while(left <= rigth){
            char temp = arr[left];
            arr[left] = arr[rigth];
            arr[rigth] = temp;
            left++;
            rigth--;
        }
        return new String(arr);
    }
}