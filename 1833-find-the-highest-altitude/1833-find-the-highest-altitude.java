class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        int i = 0;
        for(int num : gain){
            int n = num+list.get(i++);
            list.add(n);
        }
        return Collections.max(list);
    }
}