class Solution {
    public int firstMissingPositive(int[] arr) {
        int ans = number(arr);
        return ans;
    }
    public int number(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]){
                swap(i , correctIndex , arr);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1) {
                return j +1;
            }
        }
        return arr.length + 1;
    }
    public void swap(int first,int second,int[] arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}