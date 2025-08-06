class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double doubleK = k;
        int left = 0 , Maxsum = Integer.MIN_VALUE, sum = 0;
        while(left < k){
            sum = sum + nums[left++];
            Maxsum = sum;
        }
        for(int i = 0; k + i <= nums.length - 1; i++){
            sum = sum - nums[i] + nums[k + i];
            if(Maxsum < sum){
                Maxsum = sum;
            }
        }
        System.out.println(Maxsum);
        return (double)Maxsum/doubleK;
    }
}