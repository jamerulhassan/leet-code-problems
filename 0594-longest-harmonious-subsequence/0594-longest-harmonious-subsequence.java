class Solution {
    public int findLHS(int[] nums) {
        
        Arrays.sort(nums);
        if(nums[0] == nums[nums.length -1]) return 0;
        int max = 1,count = 1;
        for(int i = 0 ; i < nums.length; i++){
            int min = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if(min == nums[j] || min + 1 == nums[j]){
                    count++;
                }else{
                    break;
                }
            }
            if(max < count){
                max = count;
            }
            count = 1;
        }
        if(max == 1){
            return 0;
        }
        return max;
    }
}