class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean isContain=false;
        Arrays.sort(nums);
        for(int i=0;i < nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                isContain=true;
            }
        } 
        return isContain;                     
    }
}