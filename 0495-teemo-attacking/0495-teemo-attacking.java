class Solution {
    public int findPoisonedDuration(int[] arr, int d) {
        int sum=0;
        int high=0;
        for(int i=0;i<arr.length ;i++){
            if(arr[i]>high){
                sum=sum+d;
            }
            else{
                sum=sum+arr[i]+d-high;
            }
            high=arr[i]+d;
        }
        return sum;
    }
}