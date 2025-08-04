class Solution {
    public int distributeCandies(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int len = arr.length / 2;
        int i = 0;
        while(count < len && i < arr.length){
           if(list.indexOf(arr[i]) < 0){
                list.add(arr[i]);
                count++;
           }
            i++;
        }
        return count;
    }
}