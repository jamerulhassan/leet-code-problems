class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int flag = 0;
        if(nums.length == 2) return Math.min(nums[0],nums[1]);
        int i = 1, sum = 0;
        while(flag < nums.length / 2){
            sum = sum + Math.min(nums[nums.length - i], nums[nums.length - i - 1]);
            i = i + 2;
            flag++;
        }
        return sum;
    }
}