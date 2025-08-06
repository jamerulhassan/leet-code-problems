class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        int maxCount = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
                count++;
                if(i == nums.length - 1){
                    if(maxCount < count) maxCount = count;
                }
            }else{
                if(maxCount < count) maxCount = count;
                count = 1;
                max = nums[i];
            }
        }
        return maxCount;
    }
}