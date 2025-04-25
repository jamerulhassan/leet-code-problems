class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];

        for(int i = 0 ;i < nums.length;i++){
            int count = 0,element = nums[i];
            for(int j=0 ; j< res.length;j++){
                if((i != j) && (element > nums[j])){
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}