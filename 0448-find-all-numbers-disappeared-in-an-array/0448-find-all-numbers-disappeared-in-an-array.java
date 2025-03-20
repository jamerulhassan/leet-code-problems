class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        cyclic(nums);
        System.out.println(Arrays.toString(nums));
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i < nums.length;i++){
            if(nums[i] != i + 1){
                list.add(i+1);
            }
        }
        return list;
    }
    public void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }                                                        
            else{
                i++;
            }
        }
    }
    public void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}