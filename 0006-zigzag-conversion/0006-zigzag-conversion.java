class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() == 1) return s;
       char[][] arr = new char[numRows][s.length()];
       fill(arr, s, numRows);
       return getString(arr);
    }
    public static String getString(char[][] arr){
        String res = "";
        for(char[] row : arr){
            for(char ch : row){
                if(ch == 46 || ch == 44 || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){
                    res = res + ch;
                }
            }
        }
        return res;
    }
    public static void fill(char[][] arr, String s, int numRows){
        Boolean finish = false;
        int i = 0 , j = 0, ch = 0;
        while(ch < s.length()){
            if(i == 0 || i == 1 ){
                while(i != numRows){
                    arr[i][j] = s.charAt(ch++);
                    if (ch == s.length()){
                        finish = true;
                        break;
                    }
                    i++;
                }
            }
            else if(i == numRows){
                System.out.println(i + " "+ j);
                i = i-2;
                j = j + 1;
                while( i >= 0 && ch < s.length()){
                    arr[i][j] = s.charAt(ch++);
                    if (ch == s.length()){
                        finish = true;
                        break;
                    }
                    i--;
                    j++;
                }
                i=i+2;
                j=j-1;
            }
            if(finish) break;
        }
    }
}