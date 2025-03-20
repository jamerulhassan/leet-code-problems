class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(i , correctIndex , nums);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }
    public void swap(int first,int second,int[] arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}