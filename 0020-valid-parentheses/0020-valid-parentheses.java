class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1 ){
            return false;
        }
        ArrayList<Character> list = new ArrayList<>();
        int i;
        for( i = 0; i < s.length() ;i++){
            
            char e = s.charAt(i);

            if(e == '(' || e == '[' || e == '{'){
                if(i == s.length() - 1) return false;
                list.add(e);
                continue;
            }
            if(i == 0) return false;
            if(list.size() == 0 && i == s.length() - 1) break;
            if(e == ')' || e == ']' || e == '}'){
                if(list.size() == 0) return false;
                char check = list.get(list.size() - 1);
                
                if(((e == ')') && (check == '('))){
                    list.remove(list.size() - 1);
                }
                else if(((e == '}') && (check == '{'))){
                    list.remove(list.size() - 1);
                }
                else if(((e == ']') && (check == '['))){
                     list.remove(list.size() - 1);
                }
                else{
                    return false;
                }
            }
            
        }
        if(list.size() == s.length()){
            return false;
        }
        if(list.size() == 0 && i == s.length()){
            return true;
        }
        else{
            return false;
        }
      
    }
}