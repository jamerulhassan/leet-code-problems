class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i < nums.length - 1; i++){
            int j = (k <= nums.length - i - 1 )? k : nums.length - i - 1;
            int l = i + 1;
            while(j > 0){
                if(nums[i] == nums[l]){
                    int abs = Math.abs(i - j);
                    if(abs <= k) return true;
                }
                j--;
                l++;
            }
        }
        return false;
    }
}