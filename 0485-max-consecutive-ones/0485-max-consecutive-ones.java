class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] == 1){
                count++;
                if(i == nums.length - 1){
                    max = max < count ? count : max;
                }
            }
            else{
                max = max < count ? count : max;
                count = 0;
            }
        }
        return max;
    }
}