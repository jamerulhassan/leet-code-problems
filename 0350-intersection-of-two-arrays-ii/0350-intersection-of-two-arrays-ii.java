class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listIndex = new ArrayList<>();
        int j ;
        for(int i = 0; i < nums1.length; i++){
            int n = nums1[i];
            for(j = 0 ; j < nums2.length; j++){
                if(listIndex.indexOf(j) < 0){
                    if(n == nums2[j]){
                        list.add(nums2[j]);
                        listIndex.add(j);
                        break;
                    }
                }
            }
        }
        int[] arr = new int[list.size()];
        for(int i = 0;  i < arr.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
        /* String str1 = "";
        String str2 = "";
        for(int n : nums1){
            str1 = str1 + n;
        }
        for(int n : nums2){
            str2 = str2 + n;
        }
        String ans = "";
        ArrayList<String> list = getContentOfList("",str1);
        int max = 0;
        String reversed = new StringBuilder(str2).reverse().toString();
        for(int i = 0 ; i < list.size(); i++){
            if(str2.contains(list.get(i)) || reversed.contains(list.get(i))){
                max = Math.max(list.get(i).length(), max);
                if(max == list.get(i).length()){
                    ans = list.get(i);
                }
            }
        }
        int[] arr = new int[ans.length()];
        for(int i = 0 ; i < ans.length(); i++){
            arr[i] = ans.charAt(i) - '0';
        }
        return arr;
    } */}
    /* public  static ArrayList<String> getContentOfList(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            if(!(p.isEmpty())){

                list.add(p);
                return list;
            }
            else{
                return list;
            }

        }

        char ch = up.charAt(0);

        ArrayList<String> left = getContentOfList(p+ch,up.substring(1));
        ArrayList<String> rigth = getContentOfList(p,up.substring(1));

        left.addAll(rigth);

        return left;
    } */

}