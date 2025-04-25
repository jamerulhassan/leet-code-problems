class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k = 0,i = 0, j = nums.length / 2;
        int[] tempArr = new int[nums.length];
        while(k < nums.length){
            if(k % 2 == 0){
                tempArr[k] = nums[i++];
            }
            else{
                tempArr[k] = nums[j++];
            }
            k++;
        }
        for(int l=0;l < tempArr.length;l++){
            nums[l] = tempArr[l];
        }
        return nums;
    }
}