class Solution {
    public int maxSubArray(int[] nums) {
        int Csum=nums[0];
        int max=nums[0];
        for(int i=1;i < nums.length;i++){
            Csum=Math.max(nums[i],Csum+nums[i]);
            max=Math.max(max,Csum);
        }
        return max;
    }
}