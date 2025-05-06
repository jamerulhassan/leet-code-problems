class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int n = word1.length()+word2.length(),i=0,j=0;
        String res = "";
        while(res.length() != n){
            if(i < word1.length()){
                res = res + word1.charAt(i++);
            }
            if(j < word2.length()){
                res = res + word2.charAt(j++);
            }
        }
        return res;
    }
}