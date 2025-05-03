class Solution {
    public String interpret(String org) {
        String res = "";
        int i=0;
        while(i < org.length()){
            char ch = org.charAt(i);
            if(ch == 'G'){
                res += 'G';
                i++;
            }
            else if(ch == '(' && org.charAt(i+1) == ')'){
                res += 'o';
                i += 2;
            }
            else{
                res += "al";
                i += 4;
            }
        }
        return res;
    }
}