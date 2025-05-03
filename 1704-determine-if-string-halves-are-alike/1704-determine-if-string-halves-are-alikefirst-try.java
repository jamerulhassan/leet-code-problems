class Solution {
    public boolean halvesAreAlike(String s) {
        String str1 = s.substring(0,s.length()/2);
        String str2 = s.substring(s.length()/2,s.length());
        String vowels = "AEIOUaeiou";
        int i = 0,j=0;
        for(int k = 0;k <= str1.length();k++){
            if(k == str1.length()){
                if(vowels.contains(str1.substring(k,str1.length()))){
                i++;
                }
                if(vowels.contains(str2.substring(k,str1.length()))){
                    j++;
                }
            }
            else{
                if(vowels.contains(str1.substring(k,k+1))){
                i++;
                }
                if(vowels.contains(str2.substring(k,k+1))){
                    j++;
                }
            }
            
        }
        return i == j;
    }
}