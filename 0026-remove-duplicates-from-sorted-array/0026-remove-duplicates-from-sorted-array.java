class Solution {
    public int removeDuplicates(int[] nums) {
        int k = removeDuplicate(nums);
        return k;
    }
    static int removeDuplicate(int[] nums){
        int temp = nums[0],k=0;
        nums[k] = temp;
        k++;
        for(int i=0;i < nums.length;i++){
            if(temp != nums[i]){
                temp = nums[i];
                nums[k] = temp;
                k++;
            }
        }
        return k;
    }
}