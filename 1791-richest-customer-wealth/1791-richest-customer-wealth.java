class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] person : accounts){
            int rowSum = 0 ;
            for(int wealth : person){
                rowSum += wealth ;
            }
            if(max < rowSum){
                max = rowSum;
            }
        }
        return max;
    }
}