class Solution {
    public boolean checkOnesSegment(String s) {
        boolean flag = false ;
        for(int i = 0 ; i < s.length();i++){
            char element = s.charAt(i);
            if(element == '1'){
                if(!flag){
                    flag = true;
                }
                else if(s.charAt(i - 1) == '1'){
                    flag = true;
                }
                else{
                    return false;
                }
            }
            if(element == '0'){
                flag = true;
            }
        }
        return flag;
    }
}