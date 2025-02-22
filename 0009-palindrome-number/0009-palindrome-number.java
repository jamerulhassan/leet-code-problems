class Solution {
    public boolean isPalindrome(int x) {
        int number=0;
        int originalValue = x;
        if(x > 0 || x == 0){
            while(x != 0){
            int reminder = x % 10;
            number = number * 10 + reminder;
            x=x/10;
            }
        }
        else{
            return false;
        }
        return number == originalValue ? true : false;
    }
}