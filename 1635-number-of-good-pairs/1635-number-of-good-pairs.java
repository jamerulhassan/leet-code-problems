class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0;i < nums.length;i++){
            int element = nums[i];
            if(i == nums.length-1){
                break;
            }
            for(int j=i + 1 ; j < nums.length;j++){
                if(element == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}