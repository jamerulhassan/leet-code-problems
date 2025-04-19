class Solution {
    public int numberOfSteps(int num) {
        return helper(num,0);
    }
    static int helper(int num,int count){
        if(num == 0){
            return count;
        }
        if(num % 2 == 0){
            num = num / 2;
            return helper(num,count + 1);
        }
        else{
            return helper(num - 1,count + 1);
        }
    }
}