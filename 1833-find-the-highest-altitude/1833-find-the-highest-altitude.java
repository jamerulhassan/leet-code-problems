class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        int i = 0;
        for(int num : gain){
            list.add(num+list.get(i++));
        }
        return Collections.max(list);
    }
}