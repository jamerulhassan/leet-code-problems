class Solution {
    public int findNumbers(int[] nums) {
        return numberOfEvenDigits(nums);
    }
    public int numberOfEvenDigits(int[] nums){
        int count = 0;
        for(int num : nums){
            if(isEvendigit(num)){
                count++;
            }
        }
        return count;
    }
    public boolean isEvendigit(int num){
        int c = 0;
        if(num == 0){
            return false;
        }
        while(num > 0){
            c++;
            num/=10;
        }
        if(c % 2 == 0){
            return true;
        }
        return false;
    }
}