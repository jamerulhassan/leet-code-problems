class Solution {
    public void moveZeroes(int[] nums) {
        int value=1;
        int k=0;
        for(int i =0;i < nums.length;i++){
            if(nums[i]==0){
                value=0;
            }
        }
        if(value == 0){

            for(int i=0;i < nums.length;i++){
                if(nums[i] != 0){
                    nums[k]=nums[i];
                    k++;
                }
            }
            for(int i=nums.length-1;i >= k;i--){
            nums[i]=0;
        }
        }
        
        
    }
}