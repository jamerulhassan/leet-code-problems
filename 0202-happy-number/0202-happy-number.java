class Solution {
    public boolean isHappy(int n) {
        int f = n;
        int s = n;
        do{
            s = findSqaure(s);
            f = findSqaure(findSqaure(f));
        }while(f != s);

        if(s == 1){
            return true;
        }
        return false;
    }
    static int findSqaure(int n){
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }
}