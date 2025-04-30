class Solution {
    public int search(int[] nums, int target) {
       return ser(0,nums.length-1,nums,target);
    }
    static int ser(int s,int e,int[] nums,int target){
        if(!(s <= e)){
            return -1;
        }
        int mid = s + (e - s)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] < target){
            return ser(mid+1,e,nums,target);
        }
        if(nums[mid] > target){
            return ser(s,mid - 1,nums,target);
        }
        return -1;
    }
}