class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i < s.length();i++){
            if((s.charAt(i) >= 65 && 90 >= s.charAt(i)) || (s.charAt(i) >= 97 && 122 >= s.charAt(i)) || (s.charAt(i) >= 48 && s.charAt(i) <= 57)){
                builder.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println(builder);
        int start=0,end=builder.length()-1;
        for(int i=0;i < builder.length();i++){
            while(start <= end){
                if(builder.charAt(start) == builder.charAt(end)){
                    start++;
                    end--;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}