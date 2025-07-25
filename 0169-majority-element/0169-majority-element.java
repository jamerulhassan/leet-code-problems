class Solution {
    public int majorityElement(int[] nums) {
        ArrayList<Integer> element = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        for(int n : nums){
            int index = element.indexOf(n);
            if(index < 0){
                element.add(n);
                count.add(1);
            }
            else{
                count.set(index, count.get(index)+1);
            }
        }
        int max = 0;
        for(int i = 0; i < count.size();i++){
            int num = count.get(i);
            if(max <= num){
                max = num;
            }
        }
        return element.get(count.indexOf(max));
    }
}