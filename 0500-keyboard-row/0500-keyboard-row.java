class Solution {
    public String[] findWords(String[] words) {
        String f = "qwertyuiop";
        String s = "asdfghjkl";
        String t = "zxcvbnm";
        ArrayList<Integer> charNumbers = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            String str = words[i];
            for(int j = 0 ; j < str.length(); j++){
                char ch = Character.toLowerCase(str.charAt(j));
                if(0 <= f.indexOf(ch)) charNumbers.add(1);
                if(0 <= s.indexOf(ch)) charNumbers.add(2);
                if(0 <= t.indexOf(ch)) charNumbers.add(3);
            }
            Collections.sort(charNumbers);
            int fi = charNumbers.get(0);
            int en = charNumbers.get(charNumbers.size() - 1);
            if(fi == en) list.add(str);
            charNumbers.clear();
        }
        String[] ans = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}