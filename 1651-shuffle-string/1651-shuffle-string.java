class Solution {
    public String restoreString(String s, int[] arr) {
        String str = "";
        for(int i=0;i < s.length();i++){
            for(int j = 0;j < arr.length;j++){
                if(i == arr[j]){
                    str = str+s.charAt(j);
                }
            }
        }
        return str;
    }
}