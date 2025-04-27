class Solution {
    public boolean checkIfPangram(String str) {
        Boolean flag = false;
        if(str.length() < 26){
            return false;
        }
        for(int i=0;i < 26; i++){
            char ch =(char)('a'+i);
            String s = String.valueOf(ch);
            if(str.contains(s)){
               flag = true;
            }
            else{
                return false;
            }
        }
        return flag;
    }
}