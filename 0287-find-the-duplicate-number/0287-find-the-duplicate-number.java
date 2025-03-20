class Solution {
    public int findDuplicate(int[] arr) {
        cyclic(arr);
        for(int i=0;i < arr.length;i++){
            if(arr[i]-1 != i){
                return arr[i];
            }
        }
        return 0;
    }
    public void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    public void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}