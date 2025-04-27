class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;
        String s = String.valueOf(n);
        while( n != 0){
            int rem = n % 10;
            sum = sum + rem;
            mul = mul * rem;
            n = n / 10;
        }
        return mul - sum;
    }
}