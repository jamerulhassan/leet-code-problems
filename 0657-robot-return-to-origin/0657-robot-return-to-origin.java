class Solution {
    public boolean judgeCircle(String str) {
        int L = 0,R = 0,U = 0,D = 0;
        for(int i=0;i < str.length();i++){
            char ch = str.charAt(i);
            if (ch == 'L') {
                L++;
                continue;
            }
            if (ch == 'R') {
                R++;
                continue;
            }
            if (ch == 'U') {
                U++;
                continue;
            }
            if (ch == 'D') {
                D++;
            }
        }
        return ((L == R) && (U == D));
    }
}