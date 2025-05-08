class Solution {
    public boolean isPowerOfThree(int n) {
        int rem = n % 10;
        if(rem == 1 || rem == 3 || rem == 9 || rem == 7) return true;
        return false;
    }
}