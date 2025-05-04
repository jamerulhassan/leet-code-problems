class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Integer> list1 = new ArrayList<>();
        insertValues(list1,"",s);
        int max = list1.get(0);
         for (int i = 1; i < list1.size(); i++) {
            if (list1.get(i) > max) {
                max = list1.get(i);
            }
        }
        return max;
    }
    static void insertValues(ArrayList<Integer> list1,String p,String up){
        if(up.length() == 0){
            list1.add(up.length());
            return;
        }
        if(up.length() == 1){
            list1.add(up.length());
            return;
        }
        for(int i = 0; i < up.length();i++){
            if(p.indexOf(up.charAt(i)) == -1 ){
                p += up.charAt(i);
            }
            else{
                break;
            }
        }
        list1.add(p.length());
        insertValues(list1,"",up.substring(1));
    }
}