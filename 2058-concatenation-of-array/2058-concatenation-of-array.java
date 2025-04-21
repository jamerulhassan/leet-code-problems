class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int k=0,i=0;
        while(i < 2){
            for(int j=0;j < nums.length;j++){
                ans[k++] = nums[j];
            }
            i++;
        }
        return ans;
    }
}