class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = nums.length -1; i >= 0; i--){
            if(list.indexOf(nums[i]) < 0){
                list.add(nums[i]);
                count++;
            }
            if(count == 3){
                return list.get(list.size() - 1);
            }
        }
        if(count < 3){
            return list.get(0);
        }
        return 0;
    }
}