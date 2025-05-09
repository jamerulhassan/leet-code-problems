class Solution {
    public int kthSmallest(int[][] arr, int k) {
        int n = arr.length * arr[0].length ;
        int[] res = new int[n];
        int i = 0;
        for (int[] a : arr){
            for (int el : a){
                res[i++] = el;
            }
        }
        Arrays.sort(res);
        return res[k - 1];
    }
}