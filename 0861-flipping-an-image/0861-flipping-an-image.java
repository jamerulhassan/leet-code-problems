class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i= 0;i < image.length;i++){
            reverse(image[i]);
            flip(image[i]);
        }
        return image;
    }
    static void reverse(int[] arr){
        int l = 0;
        int r = arr.length-1;
        while(l <= r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    static void flip(int[] arr){
        for(int i=0;i < arr.length;i++){
           arr[i] = (arr[i] == 0) ? 1: 0;
        }
    }
}