class Solution {
    public String longestCommonPrefix(String[] strs) {
        String letters=strs[0];
        String finalStr="";
        boolean flag=false;
        int lengthOfStrings=getMinLength(strs);
        for(int i=0;i < lengthOfStrings;i++){
            for(int j=0;j < strs.length;j++){
                if( strs[j].charAt(i) == letters.charAt(i) && j == strs.length-1){
                    finalStr+=letters.charAt(i);
                }else if(strs[j].charAt(i) == letters.charAt(i)){
                    continue;
                }else{
                    flag=true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        System.out.println(letters);
        return finalStr;
    }
    public static int getMinLength(String[] strs){
    int minLenght=strs[0].length();
    for(int i=1;i < strs.length;i++){
        minLenght= minLenght > strs[i].length() ? strs[i].length() : minLenght ;
    }
    return minLenght;
}
}
