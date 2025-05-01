class Solution {
    public void reverseString(char[] arr) {
        System.out.println(getreverse(arr,0,arr.length-1));
    }
    static char[] getreverse(char[] arr,int left,int rigth){
        if(left > rigth){
            return arr;
        }

        char temp = arr[left];
        arr[left] = arr[rigth];
        arr[rigth] = temp;

        return getreverse(arr,left+1,rigth-1);

    }
}