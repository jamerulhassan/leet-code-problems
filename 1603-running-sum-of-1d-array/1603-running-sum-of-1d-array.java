class Solution {
    public int[] runningSum(int[] nums) {
        int k=0;
        int[] res = new int[nums.length];
        for(int i=0;i < nums.length;i++){
            int j = 0;
            int ans = 0;
            while(j <= i){
                ans = nums[j] + ans;
                j++;
            }
            System.out.println(ans);
            res[i] = ans;
        }
        return res;
    }
}