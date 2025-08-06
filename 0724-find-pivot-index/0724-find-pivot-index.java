class Solution {
    public int pivotIndex(int[] arr) {
        int leftSum = 0, rightSum = 0;
        int i = 1;
        while(i < arr.length){
            rightSum += arr[i++];
        }
        if(rightSum == 0) return 0;
        System.out.println(rightSum);
        i = 1;
        int j = 0;
        while(i < arr.length){
            leftSum += arr[i - 1];
            rightSum -= arr[i];
            if(leftSum == rightSum){
                return i;
            }
            i++;
        }
        return -1;
    }
}