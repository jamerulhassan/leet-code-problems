class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> innerList1 = new ArrayList<>();
        innerList1.add(1);
        list.add(innerList1);
        int i = 1;
        while(i < numRows){
            List<Integer> innerList2 = new ArrayList<>();
            List<Integer> aboveList = list.get(i - 1);
            innerList2.add(1);
            for(int j = 1;j <= i - 1; j++){
                innerList2.add(aboveList.get(j - 1) + aboveList.get(j));
            }
            innerList2.add(1);
            list.add(innerList2);
            i++;
        }
        return list;
    }
}