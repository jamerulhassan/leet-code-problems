class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        if(nums.length == 0) return list;
        int i = 0;
        while(i < nums.length){
            if(i == nums.length - 1){
                list.add(nums[i]+"");
                break;
            }
            int k = 1, j = 0;
            int a = nums[i];
            for(j = i+1; j <= nums.length-1;j++){
                if((a + k++) != nums[j]){
                    break;
                }
            }
            if(j == i+1){
                list.add(a+"");
            }
            else{
                list.add(""+a+"->"+nums[j-1]+"");
            }
            i = j;
        }
        return list;
    }
}